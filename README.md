TapjackingProtectionPlugin
==================

Tapjacking is the combination of “tap” and “jacking” and, as the term suggests, it means someone hijacking what a user taps on his smartphone. It is the mobile version of the “Clickjacking” for web applications.

Using social engineering an attacker can develop a malicious app that exploits tapjacking and tricks the victim into doing dispositive actions on vulnerable applications.

This plugin prevents tapjacking attacks by setting the [setFilterTouchesWhenObscured](https://developer.android.com/reference/android/view/View#setFilterTouchesWhenObscured(boolean)) to true on the main WebView.
In this way Android will discard touches when the WebView is obscured by another visible window. 


Installation
------------

For Cordova apps:

1. To add this plugin: `cordova plugin add cordova-plugin-tapjackingprotection` 
2. To remove this plugin: `cordova plugin remove cordova-plugin-tapjackingprotection` 

Usage
------

This plugin does not expose any interface, it simply and automatically protect your app against Tapjacking by setting the "setFilterTouchesWhenObscured" to true on the main WebView. 
It is not required any action except install the plugin.

