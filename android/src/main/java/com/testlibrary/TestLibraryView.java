package com.testlibrary;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class TestLibraryView extends View {
  public TestLibraryView(Context context) {
    super(context);
  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    float pointX = event.getX();
    float pointY = event.getY();
    Log.e("TOUCHED", "pointX: " + String.valueOf(pointX));
    Log.e("TOUCHED", "pointY: " + String.valueOf(pointY));
    Log.e("TOUCHED", "getAction: " + event.getAction());
    return super.onTouchEvent(event);
  }
}
