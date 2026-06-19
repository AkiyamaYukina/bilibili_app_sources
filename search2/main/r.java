package com.bilibili.search2.main;

import android.os.Handler;
import android.os.Message;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.commons.StringUtils;
import com.bilibili.search2.api.SearchSuggest;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/r.class */
@StabilityInferred(parameters = 0)
public final class r extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<SearchSuggest> f86911a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86912b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Handler f86913c = new Handler(new Handler.Callback(this) { // from class: com.bilibili.search2.main.o

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f86847a;

        {
            this.f86847a = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            final r rVar = this.f86847a;
            if (1 != message.what) {
                return true;
            }
            Object obj = message.obj;
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return true;
            }
            final int i7 = message.arg1;
            rVar.getClass();
            final String str2 = str;
            Task.call(new Callable(str2, i7) { // from class: com.bilibili.search2.main.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f86908a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f86909b;

                {
                    this.f86908a = str2;
                    this.f86909b = i7;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SearchSuggest searchSuggestA;
                    List<Rs0.a> list;
                    int i8 = this.f86909b;
                    String str3 = this.f86908a;
                    if (StringUtils.isBlank(str3)) {
                        searchSuggestA = null;
                    } else {
                        try {
                            try {
                                searchSuggestA = Qs0.b.a(str3);
                            } catch (Throwable th) {
                                BLog.w(th.getMessage(), th);
                                searchSuggestA = null;
                            }
                            if (searchSuggestA != null && (list = searchSuggestA.getList()) != null) {
                                for (Rs0.a aVar : list) {
                                    aVar.setTrackId(searchSuggestA.getTrackId());
                                    aVar.setExpStr(searchSuggestA.getExpStr());
                                }
                            }
                            if (searchSuggestA != null) {
                                searchSuggestA.setVersion(i8);
                            }
                        } catch (Exception e7) {
                            BLog.w(e7.getMessage(), e7);
                            searchSuggestA = null;
                        }
                    }
                    return searchSuggestA;
                }
            }, Task.BACKGROUND_EXECUTOR).continueWith(new Continuation(rVar) { // from class: com.bilibili.search2.main.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final r f86910a;

                {
                    this.f86910a = rVar;
                }

                @Override // bolts.Continuation
                public final Object then(Task task) {
                    SearchSuggest searchSuggest = (SearchSuggest) task.getResult();
                    if (searchSuggest == null) {
                        return null;
                    }
                    int version = searchSuggest.getVersion();
                    r rVar2 = this.f86910a;
                    if (version != rVar2.f86912b) {
                        return null;
                    }
                    rVar2.f86911a.setValue((SearchSuggest) task.getResult());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            return true;
        }
    });

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f86913c.removeCallbacksAndMessages(null);
    }
}
