package com.bilibili.music.podcast.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicPageTabStrip$SavedState.class */
class MusicPageTabStrip$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MusicPageTabStrip$SavedState> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67108a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicPageTabStrip$SavedState$a.class */
    public final class a implements Parcelable.Creator<MusicPageTabStrip$SavedState> {
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.bilibili.music.podcast.view.MusicPageTabStrip$SavedState] */
        @Override // android.os.Parcelable.Creator
        public final MusicPageTabStrip$SavedState createFromParcel(Parcel parcel) {
            ?? baseSavedState = new View.BaseSavedState(parcel);
            baseSavedState.f67108a = parcel.readInt();
            return baseSavedState;
        }

        @Override // android.os.Parcelable.Creator
        public final MusicPageTabStrip$SavedState[] newArray(int i7) {
            return new MusicPageTabStrip$SavedState[i7];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f67108a);
    }
}
