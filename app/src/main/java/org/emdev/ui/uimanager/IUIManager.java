package org.emdev.ui.uimanager;

import android.app.Activity;
import android.view.View;

import org.emdev.common.log.LogContext;
import org.emdev.common.log.LogManager;

public interface IUIManager {

    LogContext LCTX = LogManager.root().lctx("UIManager");

    IUIManager instance = new UIManager1x();

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onDestroy(Activity activity);

    void setFullScreenMode(Activity activity, View view, boolean fullScreen);

    void setTitleVisible(Activity activity, boolean visible, boolean firstTime);

    boolean isTitleVisible(Activity activity);

    void setHardwareAccelerationEnabled(Activity activity, boolean enabled);

    void setHardwareAccelerationMode(Activity activity, View view, boolean accelerated);

    void openOptionsMenu(final Activity activity, final View view);

    void invalidateOptionsMenu(final Activity activity);

    void onMenuOpened(Activity activity);

    void onMenuClosed(Activity activity);

    boolean isTabletUi(final Activity activity);
}
