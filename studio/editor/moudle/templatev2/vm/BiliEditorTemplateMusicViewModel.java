package com.bilibili.studio.editor.moudle.templatev2.vm;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.music.manager.MusicDownloadData;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel.class */
public final class BiliEditorTemplateMusicViewModel extends Yv0.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f108113o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<LoadState> f108114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<EditorTemplateTabBean>> f108115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f108116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<EditorTemplateTabItemBean> f108117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f108118g;

    @NotNull
    public final MutableLiveData<LoadState> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<EditorMusicItem>> f108119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<EditorMusicItem, Boolean>> f108120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<MusicDownloadData> f108121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public List<? extends EditorTemplateTabItemBean> f108122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Job f108123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.intelligence.logic.g f108124n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel$LoadState.class */
    public static final class LoadState {
        private static final EnumEntries $ENTRIES;
        private static final LoadState[] $VALUES;
        public static final LoadState LOADING = new LoadState("LOADING", 0);
        public static final LoadState ERROR = new LoadState("ERROR", 1);
        public static final LoadState SUCCESS = new LoadState(BCGToken.SCHEDULE_STATUS_SUCCESS, 2);

        private static final /* synthetic */ LoadState[] $values() {
            return new LoadState[]{LOADING, ERROR, SUCCESS};
        }

        static {
            LoadState[] loadStateArr$values = $values();
            $VALUES = loadStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(loadStateArr$values);
        }

        private LoadState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<LoadState> getEntries() {
            return $ENTRIES;
        }

        public static LoadState valueOf(String str) {
            return (LoadState) Enum.valueOf(LoadState.class, str);
        }

        public static LoadState[] values() {
            return (LoadState[]) $VALUES.clone();
        }
    }

    static {
        int i7 = a.f108153a;
        f108113o = a.f108153a;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.studio.editor.moudle.intelligence.logic.g, java.lang.Object] */
    public BiliEditorTemplateMusicViewModel(@NotNull Application application) {
        super(application);
        this.f108114c = new MutableLiveData<>();
        this.f108115d = new MutableLiveData<>();
        this.f108116e = new MutableLiveData<>();
        this.f108117f = new MutableLiveData<>();
        this.f108118g = new MutableLiveData<>();
        this.h = new MutableLiveData<>();
        this.f108119i = new MutableLiveData<>();
        this.f108120j = new MutableLiveData<>();
        this.f108121k = new MutableLiveData<>();
        this.f108122l = CollectionsKt.emptyList();
        this.f108124n = new Object();
    }

    public static void M0(BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel, EditVideoInfo editVideoInfo) {
        biliEditorTemplateMusicViewModel.getClass();
        BuildersKt.launch$default(((Yv0.c) biliEditorTemplateMusicViewModel).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorTemplateMusicViewModel$initMusicList$1(editVideoInfo, false, biliEditorTemplateMusicViewModel, null), 2, (Object) null);
    }

    public final void J0(boolean z6) {
        EditorMusicItem musicItem;
        MutableLiveData<MusicDownloadData> mutableLiveData = this.f108121k;
        MusicDownloadData value = mutableLiveData.getValue();
        if (value != null && (musicItem = value.getMusicItem()) != null) {
            musicItem.downloadStatus = 5;
        }
        mutableLiveData.setValue(null);
        Job job = this.f108123m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f108123m = null;
        if (z6) {
            com.bilibili.studio.editor.moudle.music.manager.b.d().b();
        }
    }

    public final void K0(@NotNull BgmMissionInfo bgmMissionInfo, @NotNull BMusic bMusic) {
        BuildersKt.launch$default(((Yv0.c) this).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorTemplateMusicViewModel$downloadMarkPoint$1(this, bgmMissionInfo, bMusic, null), 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L0(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r8, boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateMusicViewModel.L0(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, boolean, boolean, boolean):void");
    }

    public final void N0(EditVideoInfo editVideoInfo, boolean z6) {
        BuildersKt.launch$default(((Yv0.c) this).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorTemplateMusicViewModel$initTemplate$1(editVideoInfo, z6, this, null), 2, (Object) null);
    }

    public final void O0(EditVideoInfo editVideoInfo, List<? extends EditorMusicItem> list, List<? extends EditorMusicItem> list2) {
        ArrayList arrayList;
        EditorMusicInfo editorMusicInfo;
        ArrayList<BMusic> arrayList2;
        EditorMusicItem musicItem = null;
        if (editVideoInfo != null && (editorMusicInfo = editVideoInfo.getEditorMusicInfo()) != null && (arrayList2 = editorMusicInfo.bMusicList) != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = arrayList2.iterator();
            while (true) {
                arrayList = arrayList3;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((BMusic) next).isBindByTemplate) {
                    arrayList3.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        Ez0.e eVarB = Ez0.e.b();
        EditorMusicItem editorMusicItemA = eVarB != null ? eVarB.a(arrayList) : null;
        ArrayList arrayList4 = new ArrayList();
        if (editorMusicItemA != null) {
            arrayList4.add(editorMusicItemA);
        }
        MusicDownloadData musicDownloadData = com.bilibili.studio.editor.moudle.music.manager.b.d().f107904b;
        if (musicDownloadData != null) {
            musicItem = musicDownloadData.getMusicItem();
        }
        if (musicItem != null) {
            musicItem.downloadStatus = 3;
        }
        List listListOf = musicItem != null ? CollectionsKt.listOf(musicItem) : CollectionsKt.emptyList();
        if (musicItem != null) {
            R0(musicDownloadData);
        }
        List<EditorMusicItem> list3 = SequencesKt.toList(SequencesKt.take(SequencesKt.distinctBy(SequencesKt.plus(SequencesKt.plus(SequencesKt.plus(CollectionsKt.asSequence(arrayList4), listListOf), com.bilibili.studio.videoeditor.extension.j.a(list, BiliEditorTemplateMusicViewModel$onMusicResult$musicList$1.INSTANCE)), com.bilibili.studio.videoeditor.extension.j.a(list2, BiliEditorTemplateMusicViewModel$onMusicResult$musicList$2.INSTANCE)), new O11.b(1)), f108113o));
        this.f108119i.postValue(list3);
        this.f108120j.postValue(TuplesKt.to(editorMusicItemA, Boolean.FALSE));
        this.h.postValue(list3.isEmpty() ? LoadState.ERROR : LoadState.SUCCESS);
    }

    public final void P0(EditVideoInfo editVideoInfo, List<? extends EditorTemplateTabBean> list) {
        EditorTemplateTabItemBean editorTemplateTabItemBean;
        boolean z6;
        EditorTemplateTabItemBean editorTemplateTabItemBean2;
        EditVideoIntelligenceInfo intelligenceInfo;
        IntelligenceTemplateInfo intelligenceTemplateInfo;
        EditVideoIntelligenceInfo intelligenceInfo2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i7 = (editVideoInfo == null || (intelligenceInfo2 = editVideoInfo.getIntelligenceInfo()) == null) ? 0 : intelligenceInfo2.version;
        EditorTemplateTabItemBean editorTemplateTabItemBean3 = (editVideoInfo == null || (intelligenceInfo = editVideoInfo.getIntelligenceInfo()) == null || (intelligenceTemplateInfo = intelligenceInfo.templateInfo) == null) ? null : intelligenceTemplateInfo.itemBean;
        EditorTemplateTabItemBean editTemplateInfo = editVideoInfo != null ? editVideoInfo.getEditTemplateInfo() : null;
        boolean z7 = i7 > 0;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            z6 = false;
            editorTemplateTabItemBean = null;
            for (EditorTemplateTabBean editorTemplateTabBean : list) {
                ArrayList arrayList2 = new ArrayList();
                List<EditorTemplateTabItemBean> children = editorTemplateTabBean.getChildren();
                List<EditorTemplateTabItemBean> listEmptyList = children;
                if (children == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                for (EditorTemplateTabItemBean editorTemplateTabItemBean4 : listEmptyList) {
                    editorTemplateTabItemBean4.tabIndex = arrayList.size();
                    editorTemplateTabItemBean4.downloadState = 0;
                    if (z7 && editorTemplateTabItemBean3 != null && editorTemplateTabItemBean4.getOriginId() == editorTemplateTabItemBean3.getOriginId()) {
                        editorTemplateTabItemBean2 = editorTemplateTabItemBean;
                        if (editorTemplateTabItemBean == null) {
                            editorTemplateTabItemBean2 = editorTemplateTabItemBean4;
                        }
                    } else {
                        arrayList2.add(editorTemplateTabItemBean4);
                        editorTemplateTabItemBean2 = editorTemplateTabItemBean;
                    }
                    editorTemplateTabItemBean = editorTemplateTabItemBean2;
                    if (editTemplateInfo != null) {
                        editorTemplateTabItemBean = editorTemplateTabItemBean2;
                        if (editorTemplateTabItemBean4.getOriginId() == editTemplateInfo.getOriginId()) {
                            z6 = true;
                            editorTemplateTabItemBean = editorTemplateTabItemBean2;
                        }
                    }
                }
                if ((arrayList.isEmpty() && !editorTemplateTabBean.getChildren().isEmpty()) || !arrayList2.isEmpty()) {
                    EditorTemplateTabBean editorTemplateTabBean2 = new EditorTemplateTabBean();
                    editorTemplateTabBean2.setId(editorTemplateTabBean.getId());
                    editorTemplateTabBean2.setName(editorTemplateTabBean.getName());
                    editorTemplateTabBean2.setChildren(arrayList2);
                    arrayList.add(editorTemplateTabBean2);
                }
            }
        } else {
            editorTemplateTabItemBean = null;
            z6 = false;
        }
        if (editorTemplateTabItemBean != null) {
            editorTemplateTabItemBean3 = editorTemplateTabItemBean;
        }
        if (!arrayList.isEmpty()) {
            List<EditorTemplateTabItemBean> children2 = ((EditorTemplateTabBean) CollectionsKt.first(arrayList)).getChildren();
            List<EditorTemplateTabItemBean> arrayList3 = children2;
            if (children2 == null) {
                arrayList3 = new ArrayList();
            }
            if (editTemplateInfo != null && !z6 && editTemplateInfo.id > 0 && (editorTemplateTabItemBean3 == null || editTemplateInfo.getOriginId() != editorTemplateTabItemBean3.getOriginId())) {
                arrayList3.add(0, editTemplateInfo);
            }
            if (z7) {
                arrayList3.add(0, Pz0.a.a(editorTemplateTabItemBean3));
            } else {
                EditorTemplateTabItemBean editorTemplateTabItemBean5 = new EditorTemplateTabItemBean();
                Application application = BiliContext.application();
                editorTemplateTabItemBean5.name = application != null ? application.getString(2131841819) : null;
                editorTemplateTabItemBean5.id = -103L;
                editorTemplateTabItemBean5.tabIndex = 0;
                editorTemplateTabItemBean5.isTextRail = false;
                arrayList3.add(0, editorTemplateTabItemBean5);
            }
            EditorTemplateTabItemBean editorTemplateTabItemBean6 = new EditorTemplateTabItemBean();
            Application application2 = BiliContext.application();
            editorTemplateTabItemBean6.name = application2 != null ? application2.getString(2131841992) : null;
            editorTemplateTabItemBean6.id = -101L;
            editorTemplateTabItemBean6.tabIndex = 0;
            editorTemplateTabItemBean6.isTextRail = false;
            arrayList3.add(0, editorTemplateTabItemBean6);
        }
        BLog.i("BiliEditorTemplateV3ViewModel", "filterTemplateResult, cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        boolean zIsEmpty = arrayList.isEmpty();
        MutableLiveData<LoadState> mutableLiveData = this.f108114c;
        if (zIsEmpty) {
            mutableLiveData.postValue(LoadState.ERROR);
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<EditorTemplateTabItemBean> children3 = ((EditorTemplateTabBean) it.next()).getChildren();
            List<EditorTemplateTabItemBean> listEmptyList2 = children3;
            if (children3 == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList4, listEmptyList2);
        }
        this.f108122l = arrayList4;
        this.f108115d.postValue(arrayList);
        mutableLiveData.postValue(LoadState.SUCCESS);
        int i8 = -1;
        if (editVideoInfo != null) {
            EditorTemplateTabItemBean editTemplateInfo2 = editVideoInfo.getEditTemplateInfo();
            i8 = -1;
            if (editTemplateInfo2 != null) {
                Iterator<? extends EditorTemplateTabItemBean> it2 = this.f108122l.iterator();
                int i9 = 0;
                while (true) {
                    i8 = -1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(it2.next(), editTemplateInfo2)) {
                        i8 = i9;
                        break;
                    }
                    i9++;
                }
            }
        }
        int i10 = i8;
        if (i8 < 0) {
            i10 = 0;
        }
        EditorTemplateTabItemBean editorTemplateTabItemBean7 = (EditorTemplateTabItemBean) CollectionsKt.getOrNull(this.f108122l, i10);
        this.f108117f.postValue(editorTemplateTabItemBean7);
        this.f108116e.postValue(Integer.valueOf(editorTemplateTabItemBean7 != null ? editorTemplateTabItemBean7.tabIndex : 0));
    }

    public final void Q0(@Nullable EditVideoInfo editVideoInfo) {
        this.h.setValue(LoadState.LOADING);
        BuildersKt.launch$default(((Yv0.c) this).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorTemplateMusicViewModel$initMusicList$1(editVideoInfo, true, this, null), 2, (Object) null);
    }

    public final void R0(MusicDownloadData musicDownloadData) {
        this.f108121k.setValue(musicDownloadData);
        Job job = this.f108123m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f108123m = BuildersKt.launch$default(((Yv0.c) this).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorTemplateMusicViewModel$startDownloadMusic$1(this, musicDownloadData, null), 2, (Object) null);
    }
}
