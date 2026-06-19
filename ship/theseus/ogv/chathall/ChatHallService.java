package com.bilibili.ship.theseus.ogv.chathall;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.chatroomsdk.RoomApiImpl;
import com.bilibili.chatroomsdk.RoomInfo;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.ship.theseus.ogv.chathall.api.ChatHallApi;
import com.bilibili.ship.theseus.ogv.chathall.e;
import com.bilibili.ship.theseus.ogv.chathall.h;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import com.google.gson.JsonObject;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService.class */
@StabilityInferred(parameters = 0)
public final class ChatHallService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f91705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f91707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.b f91710g;

    @NotNull
    public final WebFloatLayerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f91711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f91712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public RoomInfo f91713k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f91715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f91716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public fV.i f91717o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CoroutineScope f91721s;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public RoomState f91714l = RoomState.INIT;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ChatHallApi f91718p = (ChatHallApi) ServiceGenerator.createService(ChatHallApi.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f91719q = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ChatHallService$event$1 f91720r = new h.a(this) { // from class: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$event$1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatHallService f91722a;

        {
            this.f91722a = this;
        }

        @Override // com.bilibili.ship.theseus.ogv.chathall.h.a
        public final void a(String str) {
            ChatHallService chatHallService = this.f91722a;
            BuildersKt.launch$default(chatHallService.f91704a, (CoroutineContext) null, (CoroutineStart) null, new ChatHallService$event$1$activityPicClickAction$1(str, chatHallService, null), 3, (Object) null);
        }

        @Override // com.bilibili.ship.theseus.ogv.chathall.h.a
        public final void b(String str) {
            ChatHallService chatHallService = this.f91722a;
            BuildersKt.launch$default(chatHallService.f91704a, (CoroutineContext) null, (CoroutineStart) null, new ChatHallService$event$1$popGuideDialog$1(chatHallService, str, null), 3, (Object) null);
        }

        @Override // com.bilibili.ship.theseus.ogv.chathall.h.a
        public final void c() {
            this.f91722a.f91719q.tryEmit(Boolean.TRUE);
        }

        @Override // com.bilibili.ship.theseus.ogv.chathall.h.a
        public final void d() {
            this.f91722a.f91719q.tryEmit(Boolean.FALSE);
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$RoomState.class */
    public static final class RoomState {
        private static final EnumEntries $ENTRIES;
        private static final RoomState[] $VALUES;
        public static final RoomState INIT = new RoomState("INIT", 0);
        public static final RoomState JOINING = new RoomState("JOINING", 1);
        public static final RoomState JOINED = new RoomState("JOINED", 2);

        private static final /* synthetic */ RoomState[] $values() {
            return new RoomState[]{INIT, JOINING, JOINED};
        }

        static {
            RoomState[] roomStateArr$values = $values();
            $VALUES = roomStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(roomStateArr$values);
        }

        private RoomState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<RoomState> getEntries() {
            return $ENTRIES;
        }

        public static RoomState valueOf(String str) {
            return (RoomState) Enum.valueOf(RoomState.class, str);
        }

        public static RoomState[] values() {
            return (RoomState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [com.bilibili.ship.theseus.ogv.chathall.ChatHallService$event$1] */
    @Inject
    public ChatHallService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull C8043a c8043a, @NotNull OgvSeason ogvSeason, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar, @NotNull WebFloatLayerService webFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f91704a = coroutineScope;
        this.f91705b = context;
        this.f91706c = ogvCurrentEpisodeRepository;
        this.f91707d = c8043a;
        this.f91708e = ogvSeason;
        this.f91709f = cVar;
        this.f91710g = bVar;
        this.h = webFloatLayerService;
        this.f91711i = backActionRepository;
        this.f91712j = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.chathall.ChatHallService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$1
            if (r0 == 0) goto L2e
            r0 = r6
            com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$1 r0 = (com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r10
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r6 = r0
            goto L38
        L2e:
            com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$1 r0 = new com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L38:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L70
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L68
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L5e
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lbb
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9c
        L70:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.chatroomsdk.RoomInfo r0 = r0.f91713k
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L9c
            r0 = r11
            long r0 = r0.getRoomId()
            r8 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r8
            r2 = r6
            java.lang.Object r0 = r0.f(r1, r2)
            r1 = r10
            if (r0 != r1) goto L9c
            r0 = r10
            r5 = r0
            goto Lbf
        L9c:
            com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3 r0 = new com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r5 = r0
            r0 = r6
            r1 = 2
            r0.label = r1
            r0 = r5
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto Lbb
            r0 = r10
            r5 = r0
            goto Lbf
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r5 = r0
        Lbf:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.chathall.ChatHallService.a(com.bilibili.ship.theseus.ogv.chathall.ChatHallService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b() {
        RoomState roomState = this.f91714l;
        RoomState roomState2 = RoomState.INIT;
        if (roomState == roomState2) {
            return;
        }
        this.f91714l = roomState2;
        this.f91713k = null;
        CoroutineScope coroutineScope = this.f91721s;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roomJoiningScope");
            coroutineScope2 = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope2, (CancellationException) null, 1, (Object) null);
        fV.i iVar = this.f91717o;
        fV.i iVar2 = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
            iVar2 = null;
        }
        long j7 = this.f91716n;
        iVar2.g.b();
        iVar2.d.remove(Long.valueOf(j7));
        RoomApiImpl roomApiImpl = iVar2.o;
        if (roomApiImpl != null) {
            fV.a aVar = iVar2.b;
            fV.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("businessData");
                aVar2 = null;
            }
            roomApiImpl.exitRoom(j7, aVar2.a.getType(), iVar2.k.b, !com.bilibili.ogv.infra.account.a.f67852b.isLogin());
        }
        if (EntryPointKt.getMemleakOptEnable()) {
            iVar2.m = null;
            iVar2.n = null;
        }
    }

    public final String c() {
        JsonObject jsonObject = new JsonObject();
        OgvSeason ogvSeason = this.f91708e;
        jsonObject.addProperty("season_id", Long.valueOf(ogvSeason.f94449a));
        OgvEpisode ogvEpisodeC = this.f91706c.c();
        jsonObject.addProperty("episode_id", ogvEpisodeC != null ? Long.valueOf(ogvEpisodeC.f93555a) : null);
        jsonObject.addProperty("season_type", Integer.valueOf(ogvSeason.f94450b.f71782a));
        return jsonObject.toString();
    }

    @NotNull
    public final h d() {
        h hVar = this.f91715m;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vm");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [com.bilibili.ship.theseus.ogv.chathall.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.bilibili.ship.theseus.ogv.chathall.b, java.lang.Object] */
    public final void e(String str) {
        final e.a aVar = new e.a(this.f91705b);
        aVar.f91758i = false;
        aVar.h = false;
        aVar.f91752b = str;
        aVar.f91756f = this.f91705b.getString(2131851570);
        aVar.f91757g = null;
        aVar.f91755e = true;
        final e eVar = new e(aVar.f91751a);
        e.b bVar = eVar.f91750a;
        CharSequence charSequence = aVar.f91752b;
        if (!Intrinsics.areEqual(charSequence, bVar.f91759a)) {
            bVar.f91759a = charSequence;
            bVar.notifyPropertyChanged(113);
        }
        int i7 = aVar.f91753c;
        if (i7 != bVar.f91760b) {
            bVar.f91760b = i7;
            bVar.notifyPropertyChanged(116);
        }
        if (!Intrinsics.areEqual((Object) null, (Object) null)) {
            bVar.notifyPropertyChanged(600);
        }
        int i8 = bVar.f91761c;
        int i9 = aVar.f91754d;
        if (i9 != i8) {
            bVar.f91761c = i9;
            bVar.notifyPropertyChanged(601);
        }
        boolean z6 = aVar.f91755e;
        if (z6 != bVar.f91762d) {
            bVar.f91762d = z6;
            bVar.notifyPropertyChanged(451);
        }
        if (!Intrinsics.areEqual((Object) null, (Object) null)) {
            bVar.notifyPropertyChanged(384);
        }
        String str2 = aVar.f91756f;
        if (!Intrinsics.areEqual(str2, bVar.f91763e)) {
            bVar.f91763e = str2;
            bVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_MOUTH_PARSE_RESULT_ROTATE);
        }
        final int i10 = 0;
        ?? r02 = new View.OnClickListener(i10, aVar, eVar) { // from class: com.bilibili.ship.theseus.ogv.chathall.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f91730a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f91731b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f91732c;

            {
                this.f91730a = i10;
                this.f91731b = aVar;
                this.f91732c = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r7) {
                /*
                    Method dump skipped, instruction units count: 569
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.chathall.a.onClick(android.view.View):void");
            }
        };
        if (!Intrinsics.areEqual((Object) r02, bVar.f91764f)) {
            bVar.f91764f = r02;
            bVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BACKGROUND_SEGMENT_USE_TEMPERATURE);
        }
        ?? r03 = new View.OnClickListener(aVar, eVar) { // from class: com.bilibili.ship.theseus.ogv.chathall.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e.a f91733a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e f91734b;

            {
                this.f91733a = aVar;
                this.f91734b = eVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.a aVar2 = this.f91733a;
                e eVar2 = this.f91734b;
                Function1<? super Context, Unit> function1 = aVar2.f91757g;
                if (function1 != null) {
                    function1.invoke(view.getContext());
                }
                eVar2.dismiss();
            }
        };
        if (!Intrinsics.areEqual((Object) r03, bVar.f91765g)) {
            bVar.f91765g = r03;
            bVar.notifyPropertyChanged(409);
        }
        eVar.setOnCancelListener(new DialogInterface.OnCancelListener(aVar) { // from class: com.bilibili.ship.theseus.ogv.chathall.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e.a f91748a;

            {
                this.f91748a = aVar;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f91748a.getClass();
            }
        });
        eVar.setCanceledOnTouchOutside(aVar.h);
        eVar.setCancelable(aVar.f91758i);
        eVar.setOnDismissListener(new DialogInterface.OnDismissListener(aVar) { // from class: com.bilibili.ship.theseus.ogv.chathall.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e.a f91749a;

            {
                this.f91749a = aVar;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f91749a.getClass();
            }
        });
        eVar.show();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r8, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.chathall.ChatHallService.f(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull com.bilibili.chatroomsdk.ChatRoomMember r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.chathall.ChatHallService.g(com.bilibili.chatroomsdk.ChatRoomMember, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
