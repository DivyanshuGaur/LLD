package behavioral.observer.observers;

import behavioral.observer.observable.StockObservable;

public class EmailObserverImpl implements NotificationAlertObserver{
    
	String email;
	StockObservable observable;
	
	public EmailObserverImpl(String email, StockObservable observable) {
		this.email = email;
		this.observable = observable;
	}


	@Override
	public void update() {
			sendMail(email);
	}

	public void sendMail(String email) {
		System.out.println("Email Notification sent to " +email +" ");
	}


}
