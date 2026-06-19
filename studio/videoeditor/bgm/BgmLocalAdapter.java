package com.bilibili.studio.videoeditor.bgm;

import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.studio.videoeditor.H;
import com.bilibili.studio.videoeditor.bgm.BgmLocalAdapter;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.picker.bean.AudioItem;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.U;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.widgets.MusicCropView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmLocalAdapter.class */
public final class BgmLocalAdapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f108917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BgmListActivity f108918c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f108920e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Sg.e f108923i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<BgmLocalEntry> f108916a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108919d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f108921f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, Long> f108922g = new LinkedHashMap<String, Long>(this, 256, 0.75f, true) { // from class: com.bilibili.studio.videoeditor.bgm.BgmLocalAdapter.1
        final BgmLocalAdapter this$0;

        {
            this.this$0 = this;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            return size() > 200;
        }
    };
    public final Map<String, List<WeakReference<c>>> h = new HashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmLocalAdapter$a.class */
    public static final class a extends c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmLocalAdapter$b.class */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<c> f108924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f108925b;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            c cVar = this.f108924a.get();
            if (cVar != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 21281;
                sendMessageDelayed(messageObtain, 30L);
                if (aD0.f.d().c() > 0) {
                    if (aD0.f.d().c() - aD0.f.d().b() < 250) {
                        aD0.f.d().f("BgmLocalAdapter 3");
                        aD0.f.d().h(this.f108925b);
                        cVar.f108934j.setImageResource(2131244231);
                    } else if (aD0.f.d().b() * 1000 > this.f108925b * 1000) {
                        cVar.f108931f.a(aD0.f.d().b() * 1000);
                    }
                    if (cVar.f108935k) {
                        return;
                    }
                    cVar.f108930e.setText(U.c(aD0.f.d().b()));
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmLocalAdapter$c.class */
    public static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f108926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f108927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Button f108928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f108929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f108930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MusicCropView f108931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f108932g;
        public final LinearLayout h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final BiliImageView f108933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ImageView f108934j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f108935k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f108936l;

        public c(View view) {
            super(view);
            this.f108926a = (TextView) view.findViewById(2131310619);
            this.f108927b = (TextView) view.findViewById(2131310598);
            this.f108928c = (Button) view.findViewById(2131309746);
            this.f108929d = (TextView) view.findViewById(2131310830);
            this.f108930e = (TextView) view.findViewById(2131311293);
            this.f108931f = (MusicCropView) view.findViewById(2131310832);
            this.h = (LinearLayout) view.findViewById(2131305488);
            this.f108932g = (TextView) view.findViewById(2131314860);
            this.f108933i = view.findViewById(2131303461);
            this.f108934j = (ImageView) view.findViewById(2131302510);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.Handler, com.bilibili.studio.videoeditor.bgm.BgmLocalAdapter$b] */
    public BgmLocalAdapter(BgmListActivity bgmListActivity) {
        this.f108918c = bgmListActivity;
    }

    public static void O(c cVar, BgmLocalEntry bgmLocalEntry, boolean z6, int i7) {
        bgmLocalEntry.isPlaying = z6;
        bgmLocalEntry.checked = z6;
        cVar.f108931f.setMusicStartTime(0L);
        cVar.f108930e.setText(U.c(0L));
        cVar.f108931f.a(0L);
        cVar.h.setVisibility(i7);
        cVar.f108928c.setVisibility(i7);
        cVar.f108934j.setVisibility(i7);
    }

    public final void N() {
        int i7;
        ArrayList<BgmLocalEntry> arrayList = this.f108916a;
        if (arrayList == null || (i7 = this.f108919d) < 0 || i7 >= arrayList.size()) {
            return;
        }
        BgmLocalEntry bgmLocalEntry = this.f108916a.get(this.f108919d);
        bgmLocalEntry.isPlaying = false;
        bgmLocalEntry.checked = false;
        notifyItemChanged(this.f108919d);
        this.f108919d = -1;
        this.f108917b = "";
    }

    public final void P(@Nullable List<AudioItem> list) {
        this.f108916a.clear();
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f108916a.add(new BgmLocalEntry((AudioItem) it.next()));
                }
            }
        }
        this.f108916a.add(0, new BgmLocalEntry(null));
        notifyDataSetChanged();
    }

    public final void Q() {
        int i7;
        ArrayList<BgmLocalEntry> arrayList = this.f108916a;
        if (arrayList == null || (i7 = this.f108919d) < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.f108916a.get(this.f108919d).isPlaying = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<BgmLocalEntry> arrayList = this.f108916a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (V.e(this.f108916a) || !(this.f108916a.get(i7) instanceof p)) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i7) {
        final c cVar = (c) viewHolder;
        final BgmLocalEntry bgmLocalEntry = this.f108916a.get(i7);
        if (bgmLocalEntry instanceof p) {
            cVar.itemView.setOnClickListener(new i(this, 0));
            return;
        }
        final AudioItem audioItem = bgmLocalEntry.audioItem;
        if (bgmLocalEntry.checked) {
            cVar.h.setVisibility(0);
            cVar.f108928c.setVisibility(0);
        } else {
            cVar.h.setVisibility(8);
            cVar.f108928c.setVisibility(8);
        }
        cVar.f108934j.setVisibility(4);
        cVar.f108926a.setText(audioItem.name);
        long j7 = audioItem.duration;
        long jLongValue = j7;
        if (j7 <= 0) {
            String str = audioItem.path;
            jLongValue = j7;
            if (str != null) {
                Long l7 = (Long) ((LinkedHashMap) this.f108922g).get(str);
                jLongValue = j7;
                if (l7 != null) {
                    jLongValue = l7.longValue();
                    audioItem.duration = l7.longValue();
                }
            }
        }
        cVar.f108927b.setText(U.a(jLongValue));
        cVar.f108929d.setText(U.a(jLongValue));
        MusicCropView musicCropView = cVar.f108931f;
        musicCropView.setMusicTotalTime(1000 * jLongValue);
        if (jLongValue <= 0 && !TextUtils.isEmpty(audioItem.path)) {
            final String str2 = audioItem.path;
            cVar.f108936l = str2;
            List list = (List) ((HashMap) this.h).get(str2);
            if (list != null) {
                list.add(new WeakReference(cVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(cVar));
                ((HashMap) this.h).put(str2, arrayList);
                Task.callInBackground(new Callable(str2) { // from class: com.bilibili.studio.videoeditor.bgm.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f109091a;

                    {
                        this.f109091a = str2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Long.valueOf(HC0.a.a(this.f109091a));
                    }
                }).continueWith(new Continuation(this, str2) { // from class: com.bilibili.studio.videoeditor.bgm.n

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BgmLocalAdapter f109092a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f109093b;

                    {
                        this.f109092a = this;
                        this.f109093b = str2;
                    }

                    @Override // bolts.Continuation
                    public final Object then(Task task) {
                        BgmLocalAdapter bgmLocalAdapter = this.f109092a;
                        bgmLocalAdapter.getClass();
                        long jLongValue2 = task.getResult() != null ? ((Long) task.getResult()).longValue() : 0L;
                        HashMap map = (HashMap) bgmLocalAdapter.h;
                        String str3 = this.f109093b;
                        List list2 = (List) map.remove(str3);
                        if (jLongValue2 <= 0) {
                            return null;
                        }
                        ((HashMap) bgmLocalAdapter.f108922g).put(str3, Long.valueOf(jLongValue2));
                        if (list2 == null) {
                            return null;
                        }
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            BgmLocalAdapter.c cVar2 = (BgmLocalAdapter.c) ((WeakReference) it.next()).get();
                            if (cVar2 != null && str3.equals(cVar2.f108936l)) {
                                cVar2.f108927b.setText(U.a(jLongValue2));
                                cVar2.f108929d.setText(U.a(jLongValue2));
                                cVar2.f108931f.setMusicTotalTime(1000 * jLongValue2);
                            }
                        }
                        return null;
                    }
                }, Task.UI_THREAD_EXECUTOR);
            }
        }
        cVar.f108932g.setText("<unknown>".equals(audioItem.artist) ? cVar.f108932g.getContext().getString(2131841786) : audioItem.artist);
        int i8 = audioItem.albumId;
        BiliImageView biliImageView = cVar.f108933i;
        if (i8 > 0) {
            BiliImageLoader.INSTANCE.with(biliImageView.getContext()).uri(ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), audioItem.albumId)).into(biliImageView);
        } else if (!TextUtils.isEmpty(audioItem.albumPath)) {
            BiliImageLoader.INSTANCE.with(biliImageView.getContext()).uri(Uri.fromFile(new File(audioItem.albumPath))).into(biliImageView);
        }
        musicCropView.setOnCropChangedListener(new o(this, cVar));
        cVar.itemView.setOnClickListener(new View.OnClickListener(this, cVar, bgmLocalEntry) { // from class: com.bilibili.studio.videoeditor.bgm.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BgmLocalAdapter f109082a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BgmLocalAdapter.c f109083b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BgmLocalEntry f109084c;

            {
                this.f109082a = this;
                this.f109083b = cVar;
                this.f109084c = bgmLocalEntry;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9;
                BgmLocalAdapter bgmLocalAdapter = this.f109082a;
                BgmLocalAdapter.c cVar2 = this.f109083b;
                BgmLocalEntry bgmLocalEntry2 = this.f109084c;
                int i10 = bgmLocalAdapter.f108919d;
                if (i10 != -1 && i10 != cVar2.getAdapterPosition() && (i9 = bgmLocalAdapter.f108919d) >= 0 && i9 < bgmLocalAdapter.f108916a.size()) {
                    bgmLocalAdapter.f108916a.get(bgmLocalAdapter.f108919d).isPlaying = false;
                    bgmLocalAdapter.f108916a.get(bgmLocalAdapter.f108919d).checked = false;
                    bgmLocalAdapter.notifyItemChanged(bgmLocalAdapter.f108919d);
                }
                boolean zEquals = bgmLocalEntry2.audioItem.path.equals(bgmLocalAdapter.f108917b);
                BgmListActivity bgmListActivity = bgmLocalAdapter.f108918c;
                int i11 = 2131244231;
                BgmLocalAdapter.b bVar = bgmLocalAdapter.f108921f;
                if (zEquals) {
                    bgmLocalEntry2.isPlaying = !bgmLocalEntry2.isPlaying;
                    if (bgmLocalEntry2.checked) {
                        BgmLocalAdapter.O(cVar2, bgmLocalEntry2, false, 8);
                        aD0.f.d().f("BgmLocalAdapter 1");
                        bVar.getClass();
                        bVar.f108924a = new WeakReference<>(null);
                        bVar.removeCallbacksAndMessages(null);
                    } else {
                        aD0.f.d().h(0L);
                        aD0.f.d().g();
                        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"musiclist_play_click", "click", C6635h.e(), String.valueOf(bgmListActivity.f108954x), "本地音乐", "本地"});
                        BgmLocalAdapter.O(cVar2, bgmLocalEntry2, true, 0);
                        ImageView imageView = cVar2.f108934j;
                        if (bgmLocalEntry2.isPlaying) {
                            i11 = 2131236411;
                        }
                        imageView.setImageResource(i11);
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 21281;
                        bVar.getClass();
                        bVar.f108924a = new WeakReference<>(cVar2);
                        bVar.sendMessage(messageObtain);
                    }
                } else {
                    bgmLocalAdapter.f108920e = 0L;
                    bgmLocalAdapter.f108917b = bgmLocalEntry2.audioItem.path;
                    BgmLocalAdapter.O(cVar2, bgmLocalEntry2, true, 0);
                    aD0.f.d().i(1, bgmLocalEntry2.audioItem.path, bgmListActivity.getApplicationContext());
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 21281;
                    bVar.getClass();
                    bVar.f108924a = new WeakReference<>(cVar2);
                    bVar.f108925b = bgmLocalAdapter.f108920e;
                    bVar.sendMessage(messageObtain2);
                    ImageView imageView2 = cVar2.f108934j;
                    if (bgmLocalEntry2.isPlaying) {
                        i11 = 2131236411;
                    }
                    imageView2.setImageResource(i11);
                    InfoEyesManager.getInstance().report2(false, "000225", new String[]{"musiclist_play_click", "click", C6635h.e(), String.valueOf(bgmListActivity.f108954x), "本地音乐", "本地"});
                }
                bgmLocalAdapter.f108919d = cVar2.getAdapterPosition();
            }
        });
        biliImageView.setOnClickListener(new View.OnClickListener(this, cVar, bgmLocalEntry) { // from class: com.bilibili.studio.videoeditor.bgm.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BgmLocalAdapter f109085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BgmLocalAdapter.c f109086b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BgmLocalEntry f109087c;

            {
                this.f109085a = this;
                this.f109086b = cVar;
                this.f109087c = bgmLocalEntry;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BgmLocalAdapter bgmLocalAdapter = this.f109085a;
                BgmLocalAdapter.c cVar2 = this.f109086b;
                BgmLocalEntry bgmLocalEntry2 = this.f109087c;
                bgmLocalAdapter.getClass();
                if (!bgmLocalEntry2.checked) {
                    cVar2.itemView.callOnClick();
                    return;
                }
                if (aD0.f.d().e()) {
                    aD0.f.d().f("BgmLocalAdapter 2");
                } else {
                    aD0.f.d().g();
                }
                boolean zE = aD0.f.d().e();
                bgmLocalEntry2.isPlaying = zE;
                cVar2.f108934j.setImageResource(zE ? 2131236411 : 2131244231);
            }
        });
        cVar.f108928c.setOnClickListener(new View.OnClickListener(this, bgmLocalEntry, audioItem) { // from class: com.bilibili.studio.videoeditor.bgm.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BgmLocalAdapter f109088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BgmLocalEntry f109089b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AudioItem f109090c;

            {
                this.f109088a = this;
                this.f109089b = bgmLocalEntry;
                this.f109090c = audioItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BgmLocalAdapter bgmLocalAdapter = this.f109088a;
                BgmLocalEntry bgmLocalEntry2 = this.f109089b;
                AudioItem audioItem2 = this.f109090c;
                BgmListActivity bgmListActivity = bgmLocalAdapter.f108918c;
                if (bgmListActivity == null) {
                    return;
                }
                BgmLocalAdapter.b bVar = bgmLocalAdapter.f108921f;
                bVar.getClass();
                bVar.f108924a = new WeakReference<>(null);
                bVar.removeCallbacksAndMessages(null);
                if (bgmLocalEntry2.audioItem != null) {
                    HB0.b bVar2 = HB0.b.f8155a;
                    HB0.b.m(H.a().f108867b, com.bilibili.studio.centerplus.util.g.a(bgmListActivity.f108951K), "本地", "音乐库_本地", bgmLocalAdapter.f108920e > 0);
                }
                aD0.f.d().a("BgmLocalAdapter click");
                Intent intent = new Intent();
                intent.putExtra("key_bgm_path", bgmLocalEntry2.audioItem.path);
                intent.putExtra("key_bgm_start_time", bgmLocalAdapter.f108920e);
                intent.putExtra("key_bgm_name", bgmLocalEntry2.audioItem.name);
                intent.putExtra("key_bgm_category", "音乐库_本地");
                intent.putExtra("key_bgm_from_music_edit_page", bgmListActivity.f108950J);
                if (!bgmListActivity.f108947G) {
                    bgmListActivity.setResult(-1, intent);
                    bgmListActivity.finish();
                    return;
                }
                Bgm bgm = new Bgm();
                bgm.localPath = audioItem2.path;
                bgm.name = audioItem2.name;
                bgm.category = "音乐库_本地";
                bgm.setStartTime(bgmLocalAdapter.f108920e);
                bgmListActivity.P6(intent, bgm);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i7) {
        return i7 == 1 ? new c(p.a(viewGroup, 2131498245, viewGroup, false)) : new c(p.a(viewGroup, 2131495284, viewGroup, false));
    }
}
