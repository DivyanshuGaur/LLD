package behavioral.observer.observable;
import behavioral.observer.observers.NotificationAlertObserver;

public interface StockObservable {

		public void add(NotificationAlertObserver ob);
		public void remove(NotificationAlertObserver ob);
		public void notif();
		public void setStock(int newStock);
		public int getStock();
			
}
