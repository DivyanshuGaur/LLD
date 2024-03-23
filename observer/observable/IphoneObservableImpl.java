package behavioral.observer.observable;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.observers.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable{
	
	List<NotificationAlertObserver> alist=new ArrayList<>();
	int currStock=0;

	@Override
	public void add(NotificationAlertObserver ob) {
		alist.add(ob);
		
	}

	@Override
	public void remove(NotificationAlertObserver ob) {
		alist.remove(ob);
		
	}

	@Override
	public void notif() {
		for(NotificationAlertObserver ob : alist) {
			ob.update();
		}
		
	}

	@Override
	public void setStock(int newStock) {
		if(currStock==0) {
			notif();
		}
		currStock=currStock+newStock;
			
		
	}

	@Override
	public int getStock() {
		
		return currStock;
	}

}
