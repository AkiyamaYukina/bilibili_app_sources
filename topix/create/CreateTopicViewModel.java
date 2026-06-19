package com.bilibili.topix.create;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.topix.model.SynonymTopic;
import com.bilibili.topix.model.TopicCreateLimit;
import com.bilibili.topix.model.TopicCreationResult;
import com.bilibili.topix.utils.IntervalQuerySubmitter;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicViewModel.class */
@StabilityInferred(parameters = 0)
public final class CreateTopicViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SavedStateHandle f112582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<TitleStatus> f112583b = new MutableLiveData<>(TitleStatus.Init);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<TopicCreationResult>> f112584c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<TopicCreateLimit>> f112585d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<SynonymTopic> f112586e = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IntervalQuerySubmitter<String> f112587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f112588g;

    public CreateTopicViewModel(@NotNull SavedStateHandle savedStateHandle) {
        this.f112582a = savedStateHandle;
        IntervalQuerySubmitter<String> intervalQuerySubmitter = new IntervalQuerySubmitter<>(new CreateTopicViewModel$timer$1(this), ViewModelKt.getViewModelScope(this));
        this.f112587f = intervalQuerySubmitter;
        intervalQuerySubmitter.a();
    }

    @NotNull
    public final String I0() {
        String str = (String) this.f112582a.get("topic_current_desc");
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @NotNull
    public final String J0() {
        String str = (String) this.f112582a.get("topic_current_title");
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }
}
