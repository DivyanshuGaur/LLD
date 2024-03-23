package behavioral.observer.observers;

import behavioral.observer.observable.StockObservable;

public class MobileObserverImp implements NotificationAlertObserver {

	String email;
	StockObservable observable;
		
	public MobileObserverImp(String email, StockObservable observable) {
		this.email = email;
		this.observable = observable;
	}

	@Override
	public void update() {
			sendMail(email);
	}

	public void sendMail(String email) {
		System.out.println("Mobile Notification sent to " +email +" ");
	}

}
