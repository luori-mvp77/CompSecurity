// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;


public final class AlertType extends Enum
{

    private static final AlertType $VALUES[];
    public static final AlertType ADDRESS_FORM_ERROR_MESSAGE;
    public static final AlertType ADDRESS_MISSING_STREET_NUMBER;
    public static final AlertType ADDRESS_SAVE_ERROR;
    public static final AlertType ADDRESS_SAVE_TO_PROFILE_DUPLICATE;
    public static final AlertType ADDRESS_SAVE_TO_PROFILE_ERROR;
    public static final AlertType APP_FEEDBACK_REQUEST;
    public static final AlertType BELOW_MINIMUM_ORDER_AMOUNT;
    public static final AlertType BOTH_PRODUCT_COUPON_REMOVED;
    public static final AlertType CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG;
    public static final AlertType CART_EMPTY;
    public static final AlertType CART_PRICING_FAILED;
    public static final AlertType CASH_LIMIT_EXCEEDED;
    public static final AlertType CHECKOUT_FAIL_ALERT;
    public static final AlertType COUPON_CANNOT_COMBINE;
    public static final AlertType COUPON_CARRYOUT_ONLY;
    public static final AlertType COUPON_ERROR_UNKNOWN;
    public static final AlertType COUPON_INVALID;
    public static final AlertType COUPON_IS_REMOVED;
    public static final AlertType COUPON_LIMIT_REACHED;
    public static final AlertType COUPON_NOT_AVAILABLE;
    public static final AlertType CREATE_PIZZA_PROFILE_HELP;
    public static final AlertType CVV_HELP_DIALOG;
    public static final AlertType DELETE_CONFIRMATION_COUPON;
    public static final AlertType DELETE_CONFIRMATION_ITEM_FROM_ORDER;
    public static final AlertType DELETE_CONFIRMATION_PRODUCT_COUPON_WIZARD;
    public static final AlertType DELIVERY_NOT_AVAILABLE_IN_AREA;
    public static final AlertType DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE;
    public static final AlertType DISPLAY_ESPANOL;
    public static final AlertType DUPLICATE_ADDRESS_SAVE_ERROR;
    public static final AlertType DUPLICATE_NICKNAME_DIALOG;
    public static final AlertType EASY_ORDER_HELP;
    public static final AlertType ENABLE_LOCATION;
    public static final AlertType EXPIRATION_DATE_INVALID;
    public static final AlertType FORGOT_PASSWORD;
    public static final AlertType GENERAL_CREDIT_CARD_ERROR_DIALOG;
    public static final AlertType GET_CARD_LIST_ERROR_DIALOG;
    public static final AlertType GIFT_CARD_AMOUNT_HIGH;
    public static final AlertType GIFT_CARD_AMOUNT_LOW;
    public static final AlertType GIFT_CARD_DISABLED;
    public static final AlertType GIFT_CARD_DUPLICATE;
    public static final AlertType GIFT_CARD_ERROR;
    public static final AlertType GIFT_CARD_MORE_BALANCE;
    public static final AlertType GIFT_CARD_MORE_THAN_ORDER;
    public static final AlertType GIFT_CARD_NUMBER_ERROR;
    public static final AlertType GIFT_CARD_REMOVE;
    public static final AlertType GLUTEN_FREE_CRUST;
    public static final AlertType GOOGLE_WALLET_UNAVAILABLE;
    public static final AlertType HEARTY_MARINARA_UNAVAILABLE_ON_PAN;
    public static final AlertType INVALID_EMAIL;
    public static final AlertType INVALID_PASSWORD;
    public static final AlertType KEEP_ME_SIGNED_IN_INFO;
    public static final AlertType LOCATION_ERROR;
    public static final AlertType LOYALTY_CANNOT_REDEEM;
    public static final AlertType LOYALTY_HISTORY_CALL_FAIL;
    public static final AlertType LOYALTY_NOT_ENOUGH_POINTS;
    public static final AlertType LOYALTY_NO_BASE_COUPON;
    public static final AlertType LOYALTY_OPT_OUT_CONFIRMATION;
    public static final AlertType LOYALTY_OPT_OUT_ERROR;
    public static final AlertType LOYALTY_PRICE_OR_PLACE_ORDER_FAIL;
    public static final AlertType LOYALTY_PROFILED_USER_ACTIVATE_ERROR;
    public static final AlertType LOYALTY_REDEMPTION_LIMIT;
    public static final AlertType MISSING_CHECKOUT_FIELDS;
    public static final AlertType MISSING_CREDIT_CARD_FIELD;
    public static final AlertType MISSING_FIELDS_USER_INFO;
    public static final AlertType MISSING_PASSWORD_FIELDS;
    public static final AlertType MISSING_REGISTRATION_FIELDS;
    public static final AlertType NETWORK_ERROR;
    public static final AlertType NEW_CUSTOMER_LOYALTY_ENROLL_FAIL;
    public static final AlertType NON_LOYALTY_STORE;
    public static final AlertType NO_LONGER_DELIVERY_AREA;
    public static final AlertType NO_NETWORK;
    public static final AlertType ORDER_GENERIC_CREDIT_CARD_ERROR;
    public static final AlertType ORDER_GENERIC_PULSE_ERROR;
    public static final AlertType ORDER_MINIMUM_DELIVERY_AMOUNT;
    public static final AlertType ORDER_NOT_FOUND;
    public static final AlertType ORDER_STORE_NOT_ALLOWED_FOR_CARRYOUT;
    public static final AlertType PEBBLE_DETECTED_MESSAGE;
    public static final AlertType PRIMARY_CARD_HELP_DIALOG;
    public static final AlertType PRODUCT_IS_REMOVED;
    public static final AlertType REGISTRATION_ERROR_EMAIL_ALREADY_USED;
    public static final AlertType REMEMBER_ME_HELP;
    public static final AlertType REMOVE_SAVED_ADDRESS;
    public static final AlertType REORDER_PRODUCT_OR_COUPON_CHANGED;
    public static final AlertType RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED;
    public static final AlertType SAMSUNG_TV_APP_CONNECTION_ERROR;
    public static final AlertType SAMSUNG_TV_APP_NOT_FOUND;
    public static final AlertType SAVE_TO_PROFILE_HELP_DIALOG;
    public static final AlertType SELECT_CREDIT_CARD_TYPE;
    public static final AlertType SESSION_TIMED_OUT;
    public static final AlertType SHOP_RUNNER_UNAVAILABLE;
    public static final AlertType SIGN_IN_FAILURE;
    public static final AlertType SIGN_OUT_ALERT;
    public static final AlertType STORE_CARRYOUT_CLOSED;
    public static final AlertType STORE_CARRYOUT_OFFLINE;
    public static final AlertType STORE_CARRYOUT_UNAVAILABLE;
    public static final AlertType STORE_CLOSED;
    public static final AlertType STORE_CONNECTION_ERROR;
    public static final AlertType STORE_DELIVERY_CLOSED;
    public static final AlertType STORE_DELIVERY_OFFLINE;
    public static final AlertType STORE_DELIVERY_UNAVAILABLE;
    public static final AlertType STORE_NOT_ALLOWED_FOR_DELIVERY;
    public static final AlertType STORE_NO_COUPONS;
    public static final AlertType STORE_ONLINE_ISSUE;
    public static final AlertType STORE_PHONE_INFO;
    public static final AlertType TOO_MANY_DIPPING_CUPS;
    public static final AlertType TOO_MANY_ITEMS;
    public static final AlertType TOO_MANY_SAUCES_SAND_SLICE;
    public static final AlertType TOO_MANY_TOPPINGS_LEFT;
    public static final AlertType TOO_MANY_TOPPINGS_PAN_PIZZA;
    public static final AlertType TOO_MANY_TOPPINGS_PASTA;
    public static final AlertType TOO_MANY_TOPPINGS_RIGHT;
    public static final AlertType TOO_MANY_TOPPINGS_SAND;
    public static final AlertType TOO_MANY_TOPPINGS_SAND_SLICE;
    public static final AlertType TOO_MANY_TOPPINGS_SAUCE;
    public static final AlertType TOO_MANY_TOPPINGS_WHOLE;
    public static final AlertType TRACKER_PROVIDE_FEEDBACK;
    public static final AlertType TRACKER_UNAVAILABLE;
    public static final AlertType WALLET_BACKING_NOT_ACCEPTED;

    private AlertType(String s, int i)
    {
        super(s, i);
    }

    public static AlertType valueOf(String s)
    {
        return (AlertType)Enum.valueOf(com/dominos/utils/AlertType, s);
    }

    public static AlertType[] values()
    {
        return (AlertType[])$VALUES.clone();
    }

    static 
    {
        STORE_DELIVERY_OFFLINE = new AlertType("STORE_DELIVERY_OFFLINE", 0);
        STORE_CARRYOUT_OFFLINE = new AlertType("STORE_CARRYOUT_OFFLINE", 1);
        STORE_DELIVERY_UNAVAILABLE = new AlertType("STORE_DELIVERY_UNAVAILABLE", 2);
        STORE_CARRYOUT_UNAVAILABLE = new AlertType("STORE_CARRYOUT_UNAVAILABLE", 3);
        STORE_CARRYOUT_CLOSED = new AlertType("STORE_CARRYOUT_CLOSED", 4);
        STORE_DELIVERY_CLOSED = new AlertType("STORE_DELIVERY_CLOSED", 5);
        NO_LONGER_DELIVERY_AREA = new AlertType("NO_LONGER_DELIVERY_AREA", 6);
        DELIVERY_NOT_AVAILABLE_IN_AREA = new AlertType("DELIVERY_NOT_AVAILABLE_IN_AREA", 7);
        NO_NETWORK = new AlertType("NO_NETWORK", 8);
        NETWORK_ERROR = new AlertType("NETWORK_ERROR", 9);
        STORE_CONNECTION_ERROR = new AlertType("STORE_CONNECTION_ERROR", 10);
        CART_EMPTY = new AlertType("CART_EMPTY", 11);
        GOOGLE_WALLET_UNAVAILABLE = new AlertType("GOOGLE_WALLET_UNAVAILABLE", 12);
        COUPON_CANNOT_COMBINE = new AlertType("COUPON_CANNOT_COMBINE", 13);
        COUPON_NOT_AVAILABLE = new AlertType("COUPON_NOT_AVAILABLE", 14);
        COUPON_LIMIT_REACHED = new AlertType("COUPON_LIMIT_REACHED", 15);
        COUPON_CARRYOUT_ONLY = new AlertType("COUPON_CARRYOUT_ONLY", 16);
        BELOW_MINIMUM_ORDER_AMOUNT = new AlertType("BELOW_MINIMUM_ORDER_AMOUNT", 17);
        COUPON_INVALID = new AlertType("COUPON_INVALID", 18);
        COUPON_ERROR_UNKNOWN = new AlertType("COUPON_ERROR_UNKNOWN", 19);
        STORE_NO_COUPONS = new AlertType("STORE_NO_COUPONS", 20);
        REORDER_PRODUCT_OR_COUPON_CHANGED = new AlertType("REORDER_PRODUCT_OR_COUPON_CHANGED", 21);
        TOO_MANY_DIPPING_CUPS = new AlertType("TOO_MANY_DIPPING_CUPS", 22);
        SIGN_IN_FAILURE = new AlertType("SIGN_IN_FAILURE", 23);
        DISPLAY_ESPANOL = new AlertType("DISPLAY_ESPANOL", 24);
        SESSION_TIMED_OUT = new AlertType("SESSION_TIMED_OUT", 25);
        ADDRESS_SAVE_ERROR = new AlertType("ADDRESS_SAVE_ERROR", 26);
        DUPLICATE_ADDRESS_SAVE_ERROR = new AlertType("DUPLICATE_ADDRESS_SAVE_ERROR", 27);
        GLUTEN_FREE_CRUST = new AlertType("GLUTEN_FREE_CRUST", 28);
        HEARTY_MARINARA_UNAVAILABLE_ON_PAN = new AlertType("HEARTY_MARINARA_UNAVAILABLE_ON_PAN", 29);
        TRACKER_UNAVAILABLE = new AlertType("TRACKER_UNAVAILABLE", 30);
        TRACKER_PROVIDE_FEEDBACK = new AlertType("TRACKER_PROVIDE_FEEDBACK", 31);
        ORDER_NOT_FOUND = new AlertType("ORDER_NOT_FOUND", 32);
        REMEMBER_ME_HELP = new AlertType("REMEMBER_ME_HELP", 33);
        FORGOT_PASSWORD = new AlertType("FORGOT_PASSWORD", 34);
        INVALID_PASSWORD = new AlertType("INVALID_PASSWORD", 35);
        INVALID_EMAIL = new AlertType("INVALID_EMAIL", 36);
        SHOP_RUNNER_UNAVAILABLE = new AlertType("SHOP_RUNNER_UNAVAILABLE", 37);
        CREATE_PIZZA_PROFILE_HELP = new AlertType("CREATE_PIZZA_PROFILE_HELP", 38);
        EASY_ORDER_HELP = new AlertType("EASY_ORDER_HELP", 39);
        SELECT_CREDIT_CARD_TYPE = new AlertType("SELECT_CREDIT_CARD_TYPE", 40);
        WALLET_BACKING_NOT_ACCEPTED = new AlertType("WALLET_BACKING_NOT_ACCEPTED", 41);
        GIFT_CARD_AMOUNT_HIGH = new AlertType("GIFT_CARD_AMOUNT_HIGH", 42);
        GIFT_CARD_DISABLED = new AlertType("GIFT_CARD_DISABLED", 43);
        CASH_LIMIT_EXCEEDED = new AlertType("CASH_LIMIT_EXCEEDED", 44);
        EXPIRATION_DATE_INVALID = new AlertType("EXPIRATION_DATE_INVALID", 45);
        REGISTRATION_ERROR_EMAIL_ALREADY_USED = new AlertType("REGISTRATION_ERROR_EMAIL_ALREADY_USED", 46);
        CART_PRICING_FAILED = new AlertType("CART_PRICING_FAILED", 47);
        COUPON_IS_REMOVED = new AlertType("COUPON_IS_REMOVED", 48);
        BOTH_PRODUCT_COUPON_REMOVED = new AlertType("BOTH_PRODUCT_COUPON_REMOVED", 49);
        PRODUCT_IS_REMOVED = new AlertType("PRODUCT_IS_REMOVED", 50);
        TOO_MANY_ITEMS = new AlertType("TOO_MANY_ITEMS", 51);
        ADDRESS_MISSING_STREET_NUMBER = new AlertType("ADDRESS_MISSING_STREET_NUMBER", 52);
        ADDRESS_SAVE_TO_PROFILE_ERROR = new AlertType("ADDRESS_SAVE_TO_PROFILE_ERROR", 53);
        ADDRESS_SAVE_TO_PROFILE_DUPLICATE = new AlertType("ADDRESS_SAVE_TO_PROFILE_DUPLICATE", 54);
        ADDRESS_FORM_ERROR_MESSAGE = new AlertType("ADDRESS_FORM_ERROR_MESSAGE", 55);
        SAMSUNG_TV_APP_NOT_FOUND = new AlertType("SAMSUNG_TV_APP_NOT_FOUND", 56);
        SAMSUNG_TV_APP_CONNECTION_ERROR = new AlertType("SAMSUNG_TV_APP_CONNECTION_ERROR", 57);
        APP_FEEDBACK_REQUEST = new AlertType("APP_FEEDBACK_REQUEST", 58);
        TOO_MANY_TOPPINGS_PAN_PIZZA = new AlertType("TOO_MANY_TOPPINGS_PAN_PIZZA", 59);
        DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE = new AlertType("DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE", 60);
        TOO_MANY_TOPPINGS_LEFT = new AlertType("TOO_MANY_TOPPINGS_LEFT", 61);
        TOO_MANY_TOPPINGS_WHOLE = new AlertType("TOO_MANY_TOPPINGS_WHOLE", 62);
        TOO_MANY_TOPPINGS_RIGHT = new AlertType("TOO_MANY_TOPPINGS_RIGHT", 63);
        TOO_MANY_TOPPINGS_PASTA = new AlertType("TOO_MANY_TOPPINGS_PASTA", 64);
        TOO_MANY_TOPPINGS_SAUCE = new AlertType("TOO_MANY_TOPPINGS_SAUCE", 65);
        TOO_MANY_TOPPINGS_SAND = new AlertType("TOO_MANY_TOPPINGS_SAND", 66);
        TOO_MANY_TOPPINGS_SAND_SLICE = new AlertType("TOO_MANY_TOPPINGS_SAND_SLICE", 67);
        TOO_MANY_SAUCES_SAND_SLICE = new AlertType("TOO_MANY_SAUCES_SAND_SLICE", 68);
        RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED = new AlertType("RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED", 69);
        STORE_ONLINE_ISSUE = new AlertType("STORE_ONLINE_ISSUE", 70);
        NEW_CUSTOMER_LOYALTY_ENROLL_FAIL = new AlertType("NEW_CUSTOMER_LOYALTY_ENROLL_FAIL", 71);
        LOYALTY_OPT_OUT_ERROR = new AlertType("LOYALTY_OPT_OUT_ERROR", 72);
        LOYALTY_HISTORY_CALL_FAIL = new AlertType("LOYALTY_HISTORY_CALL_FAIL", 73);
        LOYALTY_PRICE_OR_PLACE_ORDER_FAIL = new AlertType("LOYALTY_PRICE_OR_PLACE_ORDER_FAIL", 74);
        LOYALTY_PROFILED_USER_ACTIVATE_ERROR = new AlertType("LOYALTY_PROFILED_USER_ACTIVATE_ERROR", 75);
        LOCATION_ERROR = new AlertType("LOCATION_ERROR", 76);
        CVV_HELP_DIALOG = new AlertType("CVV_HELP_DIALOG", 77);
        DUPLICATE_NICKNAME_DIALOG = new AlertType("DUPLICATE_NICKNAME_DIALOG", 78);
        GENERAL_CREDIT_CARD_ERROR_DIALOG = new AlertType("GENERAL_CREDIT_CARD_ERROR_DIALOG", 79);
        GET_CARD_LIST_ERROR_DIALOG = new AlertType("GET_CARD_LIST_ERROR_DIALOG", 80);
        CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG = new AlertType("CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG", 81);
        SAVE_TO_PROFILE_HELP_DIALOG = new AlertType("SAVE_TO_PROFILE_HELP_DIALOG", 82);
        PRIMARY_CARD_HELP_DIALOG = new AlertType("PRIMARY_CARD_HELP_DIALOG", 83);
        DELETE_CONFIRMATION_ITEM_FROM_ORDER = new AlertType("DELETE_CONFIRMATION_ITEM_FROM_ORDER", 84);
        DELETE_CONFIRMATION_PRODUCT_COUPON_WIZARD = new AlertType("DELETE_CONFIRMATION_PRODUCT_COUPON_WIZARD", 85);
        DELETE_CONFIRMATION_COUPON = new AlertType("DELETE_CONFIRMATION_COUPON", 86);
        NON_LOYALTY_STORE = new AlertType("NON_LOYALTY_STORE", 87);
        MISSING_CREDIT_CARD_FIELD = new AlertType("MISSING_CREDIT_CARD_FIELD", 88);
        MISSING_PASSWORD_FIELDS = new AlertType("MISSING_PASSWORD_FIELDS", 89);
        KEEP_ME_SIGNED_IN_INFO = new AlertType("KEEP_ME_SIGNED_IN_INFO", 90);
        MISSING_CHECKOUT_FIELDS = new AlertType("MISSING_CHECKOUT_FIELDS", 91);
        STORE_PHONE_INFO = new AlertType("STORE_PHONE_INFO", 92);
        MISSING_REGISTRATION_FIELDS = new AlertType("MISSING_REGISTRATION_FIELDS", 93);
        ORDER_GENERIC_CREDIT_CARD_ERROR = new AlertType("ORDER_GENERIC_CREDIT_CARD_ERROR", 94);
        ORDER_GENERIC_PULSE_ERROR = new AlertType("ORDER_GENERIC_PULSE_ERROR", 95);
        ORDER_STORE_NOT_ALLOWED_FOR_CARRYOUT = new AlertType("ORDER_STORE_NOT_ALLOWED_FOR_CARRYOUT", 96);
        STORE_NOT_ALLOWED_FOR_DELIVERY = new AlertType("STORE_NOT_ALLOWED_FOR_DELIVERY", 97);
        STORE_CLOSED = new AlertType("STORE_CLOSED", 98);
        ORDER_MINIMUM_DELIVERY_AMOUNT = new AlertType("ORDER_MINIMUM_DELIVERY_AMOUNT", 99);
        LOYALTY_OPT_OUT_CONFIRMATION = new AlertType("LOYALTY_OPT_OUT_CONFIRMATION", 100);
        CHECKOUT_FAIL_ALERT = new AlertType("CHECKOUT_FAIL_ALERT", 101);
        SIGN_OUT_ALERT = new AlertType("SIGN_OUT_ALERT", 102);
        ENABLE_LOCATION = new AlertType("ENABLE_LOCATION", 103);
        MISSING_FIELDS_USER_INFO = new AlertType("MISSING_FIELDS_USER_INFO", 104);
        REMOVE_SAVED_ADDRESS = new AlertType("REMOVE_SAVED_ADDRESS", 105);
        PEBBLE_DETECTED_MESSAGE = new AlertType("PEBBLE_DETECTED_MESSAGE", 106);
        GIFT_CARD_REMOVE = new AlertType("GIFT_CARD_REMOVE", 107);
        GIFT_CARD_DUPLICATE = new AlertType("GIFT_CARD_DUPLICATE", 108);
        GIFT_CARD_MORE_BALANCE = new AlertType("GIFT_CARD_MORE_BALANCE", 109);
        GIFT_CARD_MORE_THAN_ORDER = new AlertType("GIFT_CARD_MORE_THAN_ORDER", 110);
        GIFT_CARD_ERROR = new AlertType("GIFT_CARD_ERROR", 111);
        GIFT_CARD_NUMBER_ERROR = new AlertType("GIFT_CARD_NUMBER_ERROR", 112);
        GIFT_CARD_AMOUNT_LOW = new AlertType("GIFT_CARD_AMOUNT_LOW", 113);
        LOYALTY_CANNOT_REDEEM = new AlertType("LOYALTY_CANNOT_REDEEM", 114);
        LOYALTY_NOT_ENOUGH_POINTS = new AlertType("LOYALTY_NOT_ENOUGH_POINTS", 115);
        LOYALTY_NO_BASE_COUPON = new AlertType("LOYALTY_NO_BASE_COUPON", 116);
        LOYALTY_REDEMPTION_LIMIT = new AlertType("LOYALTY_REDEMPTION_LIMIT", 117);
        $VALUES = (new AlertType[] {
            STORE_DELIVERY_OFFLINE, STORE_CARRYOUT_OFFLINE, STORE_DELIVERY_UNAVAILABLE, STORE_CARRYOUT_UNAVAILABLE, STORE_CARRYOUT_CLOSED, STORE_DELIVERY_CLOSED, NO_LONGER_DELIVERY_AREA, DELIVERY_NOT_AVAILABLE_IN_AREA, NO_NETWORK, NETWORK_ERROR, 
            STORE_CONNECTION_ERROR, CART_EMPTY, GOOGLE_WALLET_UNAVAILABLE, COUPON_CANNOT_COMBINE, COUPON_NOT_AVAILABLE, COUPON_LIMIT_REACHED, COUPON_CARRYOUT_ONLY, BELOW_MINIMUM_ORDER_AMOUNT, COUPON_INVALID, COUPON_ERROR_UNKNOWN, 
            STORE_NO_COUPONS, REORDER_PRODUCT_OR_COUPON_CHANGED, TOO_MANY_DIPPING_CUPS, SIGN_IN_FAILURE, DISPLAY_ESPANOL, SESSION_TIMED_OUT, ADDRESS_SAVE_ERROR, DUPLICATE_ADDRESS_SAVE_ERROR, GLUTEN_FREE_CRUST, HEARTY_MARINARA_UNAVAILABLE_ON_PAN, 
            TRACKER_UNAVAILABLE, TRACKER_PROVIDE_FEEDBACK, ORDER_NOT_FOUND, REMEMBER_ME_HELP, FORGOT_PASSWORD, INVALID_PASSWORD, INVALID_EMAIL, SHOP_RUNNER_UNAVAILABLE, CREATE_PIZZA_PROFILE_HELP, EASY_ORDER_HELP, 
            SELECT_CREDIT_CARD_TYPE, WALLET_BACKING_NOT_ACCEPTED, GIFT_CARD_AMOUNT_HIGH, GIFT_CARD_DISABLED, CASH_LIMIT_EXCEEDED, EXPIRATION_DATE_INVALID, REGISTRATION_ERROR_EMAIL_ALREADY_USED, CART_PRICING_FAILED, COUPON_IS_REMOVED, BOTH_PRODUCT_COUPON_REMOVED, 
            PRODUCT_IS_REMOVED, TOO_MANY_ITEMS, ADDRESS_MISSING_STREET_NUMBER, ADDRESS_SAVE_TO_PROFILE_ERROR, ADDRESS_SAVE_TO_PROFILE_DUPLICATE, ADDRESS_FORM_ERROR_MESSAGE, SAMSUNG_TV_APP_NOT_FOUND, SAMSUNG_TV_APP_CONNECTION_ERROR, APP_FEEDBACK_REQUEST, TOO_MANY_TOPPINGS_PAN_PIZZA, 
            DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE, TOO_MANY_TOPPINGS_LEFT, TOO_MANY_TOPPINGS_WHOLE, TOO_MANY_TOPPINGS_RIGHT, TOO_MANY_TOPPINGS_PASTA, TOO_MANY_TOPPINGS_SAUCE, TOO_MANY_TOPPINGS_SAND, TOO_MANY_TOPPINGS_SAND_SLICE, TOO_MANY_SAUCES_SAND_SLICE, RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED, 
            STORE_ONLINE_ISSUE, NEW_CUSTOMER_LOYALTY_ENROLL_FAIL, LOYALTY_OPT_OUT_ERROR, LOYALTY_HISTORY_CALL_FAIL, LOYALTY_PRICE_OR_PLACE_ORDER_FAIL, LOYALTY_PROFILED_USER_ACTIVATE_ERROR, LOCATION_ERROR, CVV_HELP_DIALOG, DUPLICATE_NICKNAME_DIALOG, GENERAL_CREDIT_CARD_ERROR_DIALOG, 
            GET_CARD_LIST_ERROR_DIALOG, CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG, SAVE_TO_PROFILE_HELP_DIALOG, PRIMARY_CARD_HELP_DIALOG, DELETE_CONFIRMATION_ITEM_FROM_ORDER, DELETE_CONFIRMATION_PRODUCT_COUPON_WIZARD, DELETE_CONFIRMATION_COUPON, NON_LOYALTY_STORE, MISSING_CREDIT_CARD_FIELD, MISSING_PASSWORD_FIELDS, 
            KEEP_ME_SIGNED_IN_INFO, MISSING_CHECKOUT_FIELDS, STORE_PHONE_INFO, MISSING_REGISTRATION_FIELDS, ORDER_GENERIC_CREDIT_CARD_ERROR, ORDER_GENERIC_PULSE_ERROR, ORDER_STORE_NOT_ALLOWED_FOR_CARRYOUT, STORE_NOT_ALLOWED_FOR_DELIVERY, STORE_CLOSED, ORDER_MINIMUM_DELIVERY_AMOUNT, 
            LOYALTY_OPT_OUT_CONFIRMATION, CHECKOUT_FAIL_ALERT, SIGN_OUT_ALERT, ENABLE_LOCATION, MISSING_FIELDS_USER_INFO, REMOVE_SAVED_ADDRESS, PEBBLE_DETECTED_MESSAGE, GIFT_CARD_REMOVE, GIFT_CARD_DUPLICATE, GIFT_CARD_MORE_BALANCE, 
            GIFT_CARD_MORE_THAN_ORDER, GIFT_CARD_ERROR, GIFT_CARD_NUMBER_ERROR, GIFT_CARD_AMOUNT_LOW, LOYALTY_CANNOT_REDEEM, LOYALTY_NOT_ENOUGH_POINTS, LOYALTY_NO_BASE_COUPON, LOYALTY_REDEMPTION_LIMIT
        });
    }
}
