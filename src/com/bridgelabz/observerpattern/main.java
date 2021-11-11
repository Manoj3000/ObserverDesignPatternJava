package com.bridgelabz.observerpattern;

import com.bridgelabz.observerpattern.News.NewsType;

public class main {
	public static void main(String[] args) {

		AajTak subject = new AajTak();
		MubmaiAajTak mubmaiAajTak = new MubmaiAajTak();
		DelhiAajTak delhiAajTak = new DelhiAajTak();
		BusinessAajTak businessAajTak = new BusinessAajTak();

		News news = new News();
		news.news = "Raining in Delhi";
		news.newsType = NewsType.DELHIAAJTAK;

		News businessNews = new News();
		businessNews.news = "Sensex up by 2000 points.";
		businessNews.newsType = NewsType.BUSINESSAAJTAK; 
		
		subject.register(mubmaiAajTak);
		subject.register(delhiAajTak);
		subject.register(businessAajTak);

		subject.update(businessNews);
		
//		subject.unRegister(mubmaiAajTak);
//		subject.update(news);
	}
}
