package com.bridgelabz.observerpattern;

import com.bridgelabz.observerpattern.News.NewsType;

//Need data from subject
public class MubmaiAajTak implements IObserver{
	@Override
	public void onUpdate(News news) {
		System.out.println(news.news);
	}

	@Override
	public NewsType getNewsType() {
		return News.NewsType.MUMBAIAAJTAK;
	}
}
