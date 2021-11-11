package com.bridgelabz.observerpattern;

public interface IObserver {
	public void onUpdate(News news);
	public News.NewsType getNewsType();
}
