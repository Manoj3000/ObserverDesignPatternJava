package com.bridgelabz.observerpattern;

import java.util.ArrayList;
import java.util.List;

//Observable class
public class AajTak {
	List<IObserver> ObserverList = new ArrayList<>();

	public void register(IObserver observer) {
		ObserverList.add(observer);
	}

	public void update(News news) {
		ObserverList.stream().filter(observer -> observer != null && observer.getNewsType() == news.newsType)
							.forEach(observer -> observer.onUpdate(news));
	}

	public void unRegister(IObserver observer) {
		ObserverList.remove(observer);
	}
}
