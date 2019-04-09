package lock;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 读写锁 可重入 锁的升级，降级
 */
public class ReadWriteLock {

	private ThreadLocal<Boolean> reading = new ThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return Boolean.valueOf(false);
		}

	};
	private ThreadLocal<Boolean> writing = new ThreadLocal<Boolean>() {
		@Override
		protected Boolean initialValue() {
			return Boolean.valueOf(false);
		}
	};
	private AtomicInteger readLock = new AtomicInteger(0);
	private AtomicBoolean writeLock = new AtomicBoolean(false);

	public boolean lockRead() {
		Thread thread = Thread.currentThread();
		// 写锁被其他线程占用
		while (!writing.get() && writeLock.get()) {
			System.out.println("readlock thread " + thread.getName() + " spining");
		}
		reading.set(true);
		readLock.incrementAndGet();
		return true;
	}

	public void unlockRead() {
		reading.set(false);
		readLock.decrementAndGet();
	}

	public boolean lockWrite() {
		Thread thread = Thread.currentThread();
		// 读锁或写锁被其他线程占用
		while ((!writing.get() && writeLock.get())
				|| !(reading.get() && readLock.get() == 1)) {
			System.out.println("writelock thread " + thread.getName() + " spining");
		}

		writing.set(true);
		writeLock.set(true);
		return false;

	}

	public void unlockWrite() {
		writing.set(false);
		writeLock.set(false);
	}

	static volatile Integer read = 0;
	static volatile Integer write = 0;

	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReadWriteLock();
//		readWriteLock.lockRead();
//		for (int i = 0; i < 10; i++) {
//			new Thread(() -> {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				readWriteLock.lockWrite();
//				System.out.println("write=" + (++write));
//				readWriteLock.unlockWrite();
//			}).start();
//		}
		readWriteLock.lockWrite();
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				readWriteLock.lockRead();
				System.out.println("read=" + (++read));
				readWriteLock.unlockRead();
			}).start();
		}
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		readWriteLock.unlockRead();
	}
}
