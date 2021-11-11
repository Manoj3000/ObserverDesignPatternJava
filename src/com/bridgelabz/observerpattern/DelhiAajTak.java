package com.bridgelabz.observerpattern;

import com.bridgelabz.observerpattern.News.NewsType;

public class DelhiAajTak implements IObserver{
	@Override
	public void onUpdate(News news) {
		System.out.println(news.news);
	}

	@Override
	public NewsType getNewsType() {
		return News.NewsType.DELHIAAJTAK;
	}
}
