package homework3;

import org.openqa.selenium.By;


public class Locators {

    private final By LOGO_IMG = By.xpath(".//a[@href='https://www.discovercars.com']/img");
    private final By CURRENCY_HREF = By.id("currentCurrency");
    private final By LOGIN_A = By.xpath(".//a[@class='navigation-link action my-booking trigger-login-modal pointer']");
    private final By CAPTION_TEXT = By.xpath(".//div[@class='home-caption']");
    private final By PICK_UP_DATE_DIV = By.xpath(".//div[@class='fake-field clearfix']");
    private final By RESIDENCE_COUNTRY_U = By.id("sb-country");
    private final By SEARCH_BTN = By.xpath(".//button[@class='button button-green button-lg submit prevent-loading trigger-gtm-sb gtm-track-fix']");
    private final By ARROW_SLIDER_SVG = By.xpath(".//div[@class='svg-slider-arrow']");
    private final By TOP_WIDGET_DIV = By.xpath(".//div[@class='tp-widget-review']");
    private final By RECOMMENDED_SECTION_H2 = By.xpath(".//div[@class='col-12']/h2");

    private final By CAR_TOP_FILTER_DIV = By.xpath(".//div[@class='car-top-filter-item car-groups-item filtering-event init']");
    private final By CAR_TOP_FILTER_SLIDER = By.xpath(".//div[@class='car-top-filter-control next']");
    private final By SHOWING_CARS_NUMBER_SPAN = By.xpath(".//span[@class='showing-cars']");
    private final By PRICE_DROPDOWN_TOGGLE_A = By.xpath(".//a[@class='dc-ui dropdown-toggle text-blue-500']");
    private final By BAG_COUNT_SPAN = By.xpath(".//ul[@class='dc-list dc-list-icon dc-list-md text-14 dc-list-horizontal dc-list-mt-8 car-params mt-8 text-gray-500']/li[2]/span");    //correct?
    private final By SPECIAL_OFFERS_BLOCK_DIV = By.xpath(".//div[@class='flt-type']");
    private final By RENTAL_CONDITION_A = By.xpath(".//a[@class='open-modal search-index trigger-gtm-rc rental-conditions with-logo']");
    private final By VIEW_BTN = By.xpath(".//div[@class='ca-table-cell top']");
    private final By CAR_SPEC_PRICE_SPAN = By.xpath(".//label[@for='air-conditioning-air-conditioning-y']/span");
    private final By FUEL_TYPE_INPUT = By.xpath(".//label[contains(@class, 'my-checkbox-label-.......']");
    private final By NUMBER_OF_SEATS_LABEL = By.xpath(".//label[@for='number-of-seats-seats-4']");
    private final By PART_PREPAYMENT_BADGE = By.xpath(".//div[@class='dc-ui badges mt-12']/span");
    private final By RATING_DIV = By.xpath(".//div[@class='supplier-rating']");
    private final By RENTAL_PRICE_DIV = By.xpath(".//div[@class='price-item-price-main']");

    private final By SPINNER_DIV = By.xpath(".//div[@class='lds-ellipsis v2']");
    private final By SEARCHING_FIRST_LINE_TEXT_DIV = By.xpath(".//div[@class='mb-8 text-24 text-bold text-center']");
    private final By SEARCHING_SECOND_LINE_DIV = By.xpath(".//div[@class='mb-24 text-center']");
}

/*
najti lokator na vse filtri, chtobi najti kol-vo elementov:
poluchitj kol-vo vseh filtrov v code: cherez cikl, rabota s odinakovimi elementami

sout "total filters count"+ kol-vo vseh filtrov


amazon






 */