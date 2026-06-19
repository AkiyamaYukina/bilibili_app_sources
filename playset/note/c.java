package com.bilibili.playset.note;

import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playset.note.RspNoteList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/c.class */
public final class c implements Observer<Bundle> {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Bundle bundle) {
        Bundle bundle2 = bundle;
        boolean z6 = bundle2.getBoolean("is_delete");
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("notes");
        if (parcelableArrayList != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parcelableArrayList, 10));
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                RspNoteList.NoteBean.ARC arc = ((RspNoteList.NoteBean) it.next()).arc;
                arrayList.add(Long.valueOf(arc != null ? arc.oid : -1L));
            }
            long[] longArray = CollectionsKt.toLongArray(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(parcelableArrayList, 10));
            Iterator it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((RspNoteList.NoteBean) it2.next()).noteId));
            }
            long[] longArray2 = CollectionsKt.toLongArray(arrayList2);
            HashMap map = new HashMap(3);
            map.put(GameCardButton.extraAvid, Arrays.toString(longArray));
            map.put("noteId", Arrays.toString(longArray2));
            map.put("note_delete_option", z6 ? "1" : "2");
            Neurons.reportClick(false, "main.mynote.note-list.note-delete-pannel.click", map);
        }
    }
}
