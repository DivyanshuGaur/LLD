package behavioral.observer;

import behavioral.observer.observable.IphoneObservableImpl;
import behavioral.observer.observable.StockObservable;
import behavioral.observer.observers.EmailObserverImpl;
import behavioral.observer.observers.MobileObserverImp;
import behavioral.observer.observers.NotificationAlertObserver;

public class Store {

		public static void main(String[] args) {
			
			StockObservable iphoneStock=new IphoneObservableImpl();
			NotificationAlertObserver obsrvrObj1=new 
					EmailObserverImpl("xyz@gmail.com",iphoneStock);
			NotificationAlertObserver obsrvrObj2=new 
					EmailObserverImpl("xyz@yahoo.com",iphoneStock);
			NotificationAlertObserver obsrvrObj3=new 
					MobileObserverImp("xyz@outlook.com",iphoneStock);
			
			iphoneStock.add(obsrvrObj1);
			iphoneStock.add(obsrvrObj2);
			iphoneStock.add(obsrvrObj3);
			
			iphoneStock.setStock(10);

			
		}
}
