package com.testlibrary;

import android.graphics.Color;
import android.view.View;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class TestLibraryViewManager extends SimpleViewManager<TestLibraryView> {
  public static final String REACT_CLASS = "TestLibraryView";

  @Override
  @NonNull
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  @NonNull
  public TestLibraryView createViewInstance(ThemedReactContext reactContext) {
    return new TestLibraryView(reactContext);
  }

  @ReactProp(name = "color")
  public void setColor(View view, String color) {
    view.setBackgroundColor(Color.parseColor(color));
  }
}
