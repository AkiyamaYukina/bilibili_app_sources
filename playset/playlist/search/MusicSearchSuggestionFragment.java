package com.bilibili.playset.playlist.search;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bilibili.playset.MultiTypeListDetailActivity;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchSuggestionFragment.class */
public class MusicSearchSuggestionFragment extends BaseSearchSuggestionsFragment {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f85355s;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof MultiTypeListDetailActivity) {
            this.f85337m = false;
        }
    }

    @Override // com.bilibili.playset.playlist.search.BaseSearchSuggestionsFragment, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Long longOrNull;
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j7 = arguments.getLong("play_list_id", -1L);
            long jLongValue = j7;
            if (j7 == -1) {
                String string = arguments.getString("media_id");
                jLongValue = (string == null || (longOrNull = StringsKt.toLongOrNull(string)) == null) ? 0L : longOrNull.longValue();
            }
            boolean z6 = false;
            boolean z7 = arguments.getBoolean("clear_query_text_after_query", false);
            this.f85342r = z7;
            if (!z7) {
                String string2 = arguments.getString("clear_query_text_after_query");
                if (string2 != null) {
                    z6 = Boolean.parseBoolean(string2);
                }
                this.f85342r = z6;
            }
            if (jLongValue >= 0) {
                this.f85355s = jLongValue;
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.bilibili.playset.playlist.search.BaseSearchSuggestionsFragment
    public final CharSequence qf() {
        return getString(2131842593);
    }
}
