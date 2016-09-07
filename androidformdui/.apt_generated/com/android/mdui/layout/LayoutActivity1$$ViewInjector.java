// Generated code from Butter Knife. Do not modify!
package com.android.mdui.layout;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class LayoutActivity1$$ViewInjector<T extends com.android.mdui.layout.LayoutActivity1> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165321, "field 'mIvPlaceholder'");
    target.mIvPlaceholder = finder.castView(view, 2131165321, "field 'mIvPlaceholder'");
    view = finder.findRequiredView(source, 2131165320, "field 'mAblAppBar'");
    target.mAblAppBar = finder.castView(view, 2131165320, "field 'mAblAppBar'");
    view = finder.findRequiredView(source, 2131165324, "field 'mTbToolbar'");
    target.mTbToolbar = finder.castView(view, 2131165324, "field 'mTbToolbar'");
    view = finder.findRequiredView(source, 2131165322, "field 'mFlTitleContainer'");
    target.mFlTitleContainer = finder.castView(view, 2131165322, "field 'mFlTitleContainer'");
    view = finder.findRequiredView(source, 2131165323, "field 'mLlTitleContainer'");
    target.mLlTitleContainer = finder.castView(view, 2131165323, "field 'mLlTitleContainer'");
    view = finder.findRequiredView(source, 2131165325, "field 'mTvToolbarTitle'");
    target.mTvToolbarTitle = finder.castView(view, 2131165325, "field 'mTvToolbarTitle'");
  }

  @Override public void reset(T target) {
    target.mIvPlaceholder = null;
    target.mAblAppBar = null;
    target.mTbToolbar = null;
    target.mFlTitleContainer = null;
    target.mLlTitleContainer = null;
    target.mTvToolbarTitle = null;
  }
}
