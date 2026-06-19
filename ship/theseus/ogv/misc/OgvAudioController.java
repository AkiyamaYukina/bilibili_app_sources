package com.bilibili.ship.theseus.ogv.misc;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.ui.feed.panel.n;
import com.bilibili.ship.theseus.ogv.misc.OgvAudioController;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvAudioController.class */
@StabilityInferred(parameters = 0)
public final class OgvAudioController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f94030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SoundPool f94031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<String, a> f94032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final n f94034e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvAudioController$SoundLoadState.class */
    public static final class SoundLoadState {
        private static final EnumEntries $ENTRIES;
        private static final SoundLoadState[] $VALUES;
        public static final SoundLoadState LOADING = new SoundLoadState("LOADING", 0);
        public static final SoundLoadState LOAD_SUCCESS = new SoundLoadState("LOAD_SUCCESS", 1);

        private static final /* synthetic */ SoundLoadState[] $values() {
            return new SoundLoadState[]{LOADING, LOAD_SUCCESS};
        }

        static {
            SoundLoadState[] soundLoadStateArr$values = $values();
            $VALUES = soundLoadStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(soundLoadStateArr$values);
        }

        private SoundLoadState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<SoundLoadState> getEntries() {
            return $ENTRIES;
        }

        public static SoundLoadState valueOf(String str) {
            return (SoundLoadState) Enum.valueOf(SoundLoadState.class, str);
        }

        public static SoundLoadState[] values() {
            return (SoundLoadState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvAudioController$SoundPendingAction.class */
    public static final class SoundPendingAction {
        private static final EnumEntries $ENTRIES;
        private static final SoundPendingAction[] $VALUES;
        public static final SoundPendingAction PENDING_NOTHING = new SoundPendingAction("PENDING_NOTHING", 0);
        public static final SoundPendingAction PENDING_PLAY = new SoundPendingAction("PENDING_PLAY", 1);

        private static final /* synthetic */ SoundPendingAction[] $values() {
            return new SoundPendingAction[]{PENDING_NOTHING, PENDING_PLAY};
        }

        static {
            SoundPendingAction[] soundPendingActionArr$values = $values();
            $VALUES = soundPendingActionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(soundPendingActionArr$values);
        }

        private SoundPendingAction(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<SoundPendingAction> getEntries() {
            return $ENTRIES;
        }

        public static SoundPendingAction valueOf(String str) {
            return (SoundPendingAction) Enum.valueOf(SoundPendingAction.class, str);
        }

        public static SoundPendingAction[] values() {
            return (SoundPendingAction[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvAudioController$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f94035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final n f94036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f94037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public SoundLoadState f94038d = SoundLoadState.LOADING;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public SoundPendingAction f94039e = SoundPendingAction.PENDING_NOTHING;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final OgvAudioController f94040f;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.misc.OgvAudioController$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/misc/OgvAudioController$a$a.class */
        public static final /* synthetic */ class C0740a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f94041a;

            static {
                int[] iArr = new int[SoundLoadState.values().length];
                try {
                    iArr[SoundLoadState.LOAD_SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[SoundLoadState.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f94041a = iArr;
            }
        }

        public a(@NotNull OgvAudioController ogvAudioController, @NotNull String str, n nVar) {
            this.f94040f = ogvAudioController;
            this.f94035a = str;
            this.f94036b = nVar;
            BuildersKt.launch$default(ogvAudioController.f94033d, (CoroutineContext) null, (CoroutineStart) null, new OgvAudioController$SoundPlayTask$1(ogvAudioController, this, null), 3, (Object) null);
        }
    }

    public OgvAudioController(@NotNull Context context) {
        this.f94030a = context;
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).build();
        this.f94031b = soundPoolBuild;
        this.f94032c = new HashMap<>();
        this.f94033d = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        SoundPool.OnLoadCompleteListener onLoadCompleteListener = new SoundPool.OnLoadCompleteListener(this) { // from class: com.bilibili.ship.theseus.ogv.misc.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvAudioController f94049a;

            {
                this.f94049a = this;
            }

            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, final int i7, int i8) {
                Object next;
                OgvAudioController ogvAudioController = this.f94049a;
                if (i8 != 0) {
                    CollectionsKt.v(ogvAudioController.f94032c.values(), new Function1(i7) { // from class: com.bilibili.ship.theseus.ogv.misc.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f94050a;

                        {
                            this.f94050a = i7;
                        }

                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(((OgvAudioController.a) obj).f94037c == this.f94050a);
                        }
                    });
                    return;
                }
                Iterator<T> it = ogvAudioController.f94032c.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((OgvAudioController.a) next).f94037c == i7) {
                            break;
                        }
                    }
                }
                OgvAudioController.a aVar = (OgvAudioController.a) next;
                if (aVar != null) {
                    aVar.f94038d = OgvAudioController.SoundLoadState.LOAD_SUCCESS;
                    if (aVar.f94039e == OgvAudioController.SoundPendingAction.PENDING_PLAY) {
                        aVar.f94040f.f94031b.play(aVar.f94037c, 1.0f, 1.0f, 1, 0, 1.0f);
                    }
                }
            }
        };
        this.f94034e = new n(this, 3);
        soundPoolBuild.setOnLoadCompleteListener(onLoadCompleteListener);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(@NotNull String str) throws NoWhenBranchMatchedException {
        HashMap<String, a> map = this.f94032c;
        a aVar = map.get(str);
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = new a(this, str, this.f94034e);
            map.put(str, aVar2);
        }
        a aVar3 = aVar2;
        int i7 = a.C0740a.f94041a[aVar3.f94038d.ordinal()];
        if (i7 == 1) {
            aVar3.f94040f.f94031b.play(aVar3.f94037c, 1.0f, 1.0f, 1, 0, 1.0f);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar3.f94039e = SoundPendingAction.PENDING_PLAY;
        }
    }
}
