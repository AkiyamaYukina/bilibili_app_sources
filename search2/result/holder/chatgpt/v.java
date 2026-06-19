package com.bilibili.search2.result.holder.chatgpt;

import android.animation.Animator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/v.class */
public final class v implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchChatGptHolder f88047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bl.o f88048b;

    public v(SearchChatGptHolder searchChatGptHolder, Bl.o oVar) {
        this.f88047a = searchChatGptHolder;
        this.f88048b = oVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LifecycleOwner viewLifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        MutableLiveData<Boolean> mutableLiveData;
        com.bilibili.search2.result.j jVar = this.f88047a.f87934c;
        if (jVar != null && (mutableLiveData = jVar.f88254a) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        this.f88047a.t0(this.f88048b, true);
        SearchChatGptHolder searchChatGptHolder = this.f88047a;
        Fragment fragment = searchChatGptHolder.getFragment();
        if (fragment == null || (viewLifecycleOwner = fragment.getViewLifecycleOwner()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) == null) {
            return;
        }
        lifecycleScope.launchWhenCreated(new SearchChatGptHolder$refreshSessionId$1(searchChatGptHolder, null));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
