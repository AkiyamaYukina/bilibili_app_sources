package com.bilibili.playset.playlist.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.tribe.core.internal.Hooks;
import qs0.AbstractActivityC8480a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchActivity.class */
public class MusicSearchActivity extends AbstractActivityC8480a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f85347G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f85348H;

    @Override // qs0.AbstractActivityC8480a
    public final MusicSearchSuggestionFragment P6() {
        MusicSearchSuggestionFragment musicSearchSuggestionFragment = (MusicSearchSuggestionFragment) getSupportFragmentManager().findFragmentByTag("MusicSearchSuggestionFragment");
        MusicSearchSuggestionFragment musicSearchSuggestionFragment2 = musicSearchSuggestionFragment;
        if (musicSearchSuggestionFragment == null) {
            musicSearchSuggestionFragment2 = new MusicSearchSuggestionFragment();
        }
        return musicSearchSuggestionFragment2;
    }

    @Override // qs0.AbstractActivityC8480a
    public final String Q6() {
        return this.f85348H;
    }

    @Override // qs0.AbstractActivityC8480a
    public final boolean R6(Intent intent) {
        String str = this.f85348H;
        intent.getAction();
        String stringExtra = intent.getStringExtra("query");
        this.f85348H = stringExtra;
        if (stringExtra == null) {
            this.f85348H = intent.getStringExtra("user_query");
        }
        this.f126297D.setText(this.f85348H);
        if (TextUtils.equals(str, this.f85348H)) {
            return false;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        long j7 = this.f85347G;
        String str2 = this.f85348H;
        MusicSearchResultFragment musicSearchResultFragment = new MusicSearchResultFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("playlist_id", j7);
        bundle.putString("keyword", str2);
        musicSearchResultFragment.setArguments(bundle);
        fragmentTransactionBeginTransaction.replace(2131298661, musicSearchResultFragment, "MusicSearchResultFragment").commit();
        return true;
    }

    @Override // qs0.AbstractActivityC8480a
    public final void S6() {
        this.f126297D.setHint(2131842593);
        Bundle bundleExtra = getIntent().getBundleExtra("playlist_id");
        if (bundleExtra != null) {
            this.f85347G = bundleExtra.getLong("media_id");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }
}
