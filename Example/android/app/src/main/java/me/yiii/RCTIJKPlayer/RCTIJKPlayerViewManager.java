package me.yiii.RCTIJKPlayer;

import android.support.annotation.Nullable;
import android.util.Log;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RCTIJKPlayerViewManager extends SimpleViewManager<RCTIJKPlayerView> {
    private static final String REACT_CLASS = "RCTIJKPlayer";

    public static final String PROP_SOURCE = "source";

    public RCTIJKPlayerViewManager(){}

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RCTIJKPlayerView createViewInstance(ThemedReactContext context) {
        return new RCTIJKPlayerView(context);
    }

    @ReactProp(name = PROP_SOURCE)
    public void setPropSource( RCTIJKPlayerView view, @Nullable String param) {
        view.start(param);
    }
}
