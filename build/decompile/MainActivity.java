/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.TypedArray
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  androidx.appcompat.app.ActionBar
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.example.myapplication2.databinding.ActivityMainBinding
 */
package com.example.myapplication2;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication2.Materi;
import com.example.myapplication2.Materi2;
import com.example.myapplication2.Materi3;
import com.example.myapplication2.databinding.ActivityMainBinding;
import com.example.myapplication2.listAdapter;
import com.example.myapplication2.tense;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/example/myapplication2/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/myapplication2/databinding/ActivityMainBinding;", "getListTense", "Ljava/util/ArrayList;", "Lcom/example/myapplication2/tense;", "Lkotlin/collections/ArrayList;", "getGetListTense", "()Ljava/util/ArrayList;", "list", "rvTense", "Landroidx/recyclerview/widget/RecyclerView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "showRecyclerList", "showSelectedHero", "hero", "app_debug"})
public final class MainActivity
extends AppCompatActivity {
    private RecyclerView rvTense;
    @NotNull
    private final ArrayList<tense> list = new ArrayList();
    private ActivityMainBinding binding;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        block4: {
            super.onCreate(savedInstanceState);
            ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate((LayoutInflater)this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue((Object)activityMainBinding, "inflate(layoutInflater)");
            this.binding = activityMainBinding;
            ActivityMainBinding activityMainBinding2 = this.binding;
            if (activityMainBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainBinding2 = null;
            }
            this.setContentView((View)activityMainBinding2.getRoot());
            View view = this.findViewById(2131362059);
            Intrinsics.checkNotNullExpressionValue((Object)view, "findViewById(R.id.materi)");
            this.rvTense = (RecyclerView)view;
            RecyclerView recyclerView = this.rvTense;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvTense");
                recyclerView = null;
            }
            recyclerView.setHasFixedSize(true);
            this.list.addAll((Collection<tense>)this.getGetListTense());
            this.showRecyclerList();
            ActivityMainBinding activityMainBinding3 = this.binding;
            if (activityMainBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainBinding3 = null;
            }
            this.setSupportActionBar(activityMainBinding3.toolbar);
            ActionBar actionBar = this.getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
            ActionBar actionBar2 = this.getSupportActionBar();
            if (actionBar2 == null) break block4;
            actionBar2.setHomeButtonEnabled(true);
        }
    }

    public boolean onSupportNavigateUp() {
        this.getOnBackPressedDispatcher().onBackPressed();
        return true;
    }

    private final ArrayList<tense> getGetListTense() {
        String[] arrstring = this.getResources().getStringArray(2130903042);
        Intrinsics.checkNotNullExpressionValue(arrstring, "resources.getStringArray(R.array.data_name)");
        String[] dataName = arrstring;
        TypedArray typedArray = this.getResources().obtainTypedArray(2130903041);
        Intrinsics.checkNotNullExpressionValue((Object)typedArray, "resources.obtainTypedArray(R.array.data_foto)");
        TypedArray datafoto = typedArray;
        String[] arrstring2 = this.getResources().getStringArray(2130903043);
        Intrinsics.checkNotNullExpressionValue(arrstring2, "resources.getStringArray(R.array.tenses)");
        String[] dataMateri = arrstring2;
        String[] arrstring3 = this.getResources().getStringArray(2130903040);
        Intrinsics.checkNotNullExpressionValue(arrstring3, "resources.getStringArray(R.array.contoh)");
        String[] dataContoh = arrstring3;
        ArrayList<tense> listTense = new ArrayList<tense>();
        int n = dataName.length;
        for (int i = 0; i < n; ++i) {
            String string = dataName[i];
            Intrinsics.checkNotNullExpressionValue(string, "dataName[i]");
            int n2 = datafoto.getResourceId(i, -1);
            String string2 = dataMateri[i];
            Intrinsics.checkNotNullExpressionValue(string2, "dataMateri[i]");
            String string3 = dataContoh[i];
            Intrinsics.checkNotNullExpressionValue(string3, "dataContoh[i]");
            tense tense2 = new tense(string, n2, string2, string3);
            listTense.add(tense2);
        }
        return listTense;
    }

    private final void showRecyclerList() {
        RecyclerView recyclerView = this.rvTense;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvTense");
            recyclerView = null;
        }
        recyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager((Context)this));
        listAdapter listHeroAdapter = new listAdapter(this.list);
        RecyclerView recyclerView2 = this.rvTense;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvTense");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter((RecyclerView.Adapter)listHeroAdapter);
        listHeroAdapter.setOnItemClickCallback(new listAdapter.OnItemClickCallback(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
            }

            public void onItemClicked(@NotNull tense data) {
                Intrinsics.checkNotNullParameter(data, "data");
                MainActivity.access$showSelectedHero(this.this$0, data);
            }
        });
    }

    private final void showSelectedHero(tense hero) {
        if (Intrinsics.areEqual(hero.getName(), "Metamorfosis Sempurna")) {
            Intent intent = new Intent((Context)this, Materi.class);
            intent.putExtra("extra_materi", (Parcelable)hero);
            intent.putExtra("name", hero.getName());
            this.startActivity(intent);
        } else if (Intrinsics.areEqual(hero.getName(), "Metamorfosis Tidak Sempurna")) {
            Intent intent = new Intent((Context)this, Materi2.class);
            intent.putExtra("extra_materi", (Parcelable)hero);
            intent.putExtra("name", hero.getName());
            this.startActivity(intent);
        } else {
            Intent intent = new Intent((Context)this, Materi3.class);
            intent.putExtra("extra_materi", (Parcelable)hero);
            intent.putExtra("name", hero.getName());
            this.startActivity(intent);
        }
    }

    public static final /* synthetic */ void access$showSelectedHero(MainActivity $this, tense hero) {
        $this.showSelectedHero(hero);
    }
}
