/**
 * TapjackingProtectionPlugin.java Cordova Plugin Implementation
 * Created by BeDefended on 17/06/2018.
 * Copyright (c) 2018 BeDefended. All rights reserved.
 * MIT Licensed
 */
package com.bedefended.tapjackingprotection;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import android.content.Context;
import android.os.Bundle;

/**
 * This class sets the "setFilterTouchesWhenObscured" on the webview 
 * to protect against Tapjacking attacks
 */
public class TapjackingProtectionPlugin extends CordovaPlugin {

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    webView.getView().setFilterTouchesWhenObscured(true);
    super.initialize(cordova, webView);
	
  }
}
