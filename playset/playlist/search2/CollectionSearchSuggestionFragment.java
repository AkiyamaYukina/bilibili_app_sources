package com.bilibili.playset.playlist.search2;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.ui.garb.GarbManager;
import es0.r;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchSuggestionFragment.class */
@StabilityInferred(parameters = 0)
public final class CollectionSearchSuggestionFragment extends BaseSearchSuggestionsFragment {
    @Override // com.bilibili.playset.playlist.search2.BaseSearchSuggestionsFragment
    @NotNull
    public final CharSequence kf() {
        return getString(2131842593);
    }

    @Override // com.bilibili.playset.playlist.search2.BaseSearchSuggestionsFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getLong("play_list_id", -1L) == -1 && (string = arguments.getString("media_id")) != null) {
                StringsKt.toLongOrNull(string);
            }
            boolean z6 = false;
            boolean z7 = arguments.getBoolean("clear_query_text_after_query", false);
            this.f85387l = z7;
            if (!z7) {
                String string2 = arguments.getString("clear_query_text_after_query");
                if (string2 != null) {
                    z6 = Boolean.parseBoolean(string2);
                }
                this.f85387l = z6;
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.bilibili.playset.playlist.search2.BaseSearchSuggestionsFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ListView listView;
        String string;
        Boolean booleanStrictOrNull;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if ((arguments == null || (string = arguments.getString("isEmbedded")) == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(string)) == null) ? false : booleanStrictOrNull.booleanValue()) {
            int curBottomTabHeight = GarbManager.getCurBottomTabHeight(requireContext().getApplicationContext());
            r rVar = this.f85388m;
            if (rVar == null || (listView = rVar.f117466b) == null) {
                return;
            }
            listView.setClipToPadding(false);
            listView.setPadding(listView.getPaddingLeft(), listView.getPaddingTop(), listView.getPaddingRight(), curBottomTabHeight);
        }
    }
}
