package com.bilibili.search2.comic;

import Pg.l;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/comic/c.class */
@StabilityInferred(parameters = 0)
public final class c extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<ArrayList<BaseSearchItem>>> f86379a = new MutableLiveData<>();

    public static final List I0(c cVar, List list, String str) {
        cVar.getClass();
        return SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(list), new l(str, 3))));
    }
}
