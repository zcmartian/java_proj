import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	private final static Semaphore MAX_SEMA_PHORE = new Semaphore(10);

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			final int num = i;
			final Random radom = new Random();
			final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			
			new Thread() {
				public void run() {
					boolean acquired = false;
					try {
						MAX_SEMA_PHORE.acquire();
						acquired = true;
						System.out.println("我是线程：" + num + " 我获得了使用权！" + (df.format(new Date())));
						long time = 1000 * Math.max(1, Math.abs(radom.nextInt() % 10));
						Thread.sleep(time);
						System.out.println("我是线程：" + num + " 我执行完了！" + (df.format(new Date())));
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (acquired) {
							MAX_SEMA_PHORE.release();
						}
					}
				}
			}.start();
		}
	}
}
