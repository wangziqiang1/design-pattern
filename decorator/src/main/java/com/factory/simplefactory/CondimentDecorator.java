package com.factory.simplefactory;

/**
 * 调料的装饰者
 */
public abstract class CondimentDecorator extends Beverage{
    @Override
    public abstract String getDescription();
}
