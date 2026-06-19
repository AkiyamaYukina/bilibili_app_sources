package com.bilibili.ogv.misc.preference;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;
import com.bilibili.pvtracker.IPvTracker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/preference/TimelinePreferenceFragment.class */
public class TimelinePreferenceFragment extends PreferenceFragmentCompat implements IPvTracker {
    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "main.ogv-follow.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        return null;
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public final void onCreatePreferences(Bundle bundle, String str) {
        p3().setTitle(getString(2131822174));
        addPreferencesFromResource(2132082728);
    }
}
