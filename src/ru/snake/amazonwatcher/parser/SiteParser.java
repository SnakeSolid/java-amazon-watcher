package ru.snake.amazonwatcher.parser;

import ru.snake.amazonwatcher.model.PriceInfo;

public interface SiteParser {

	public abstract void parseUrl(String url);

	public abstract String getName();

	public abstract PriceInfo getPrice();

}