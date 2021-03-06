package com.example.brianbaek.practicemvvm.main;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import com.example.brianbaek.practicemvvm.R;
import com.example.brianbaek.practicemvvm.databinding.ActMainBinding;

public class MainAct extends AppCompatActivity {

    private ActMainBinding actMainBinding;
    private MainVM viewModel;
    private ObservableArrayList observableArrayList;
    TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actMainBinding = DataBindingUtil.setContentView(this, R.layout.act_main);
        viewModel = new MainVM();
        actMainBinding.setMainvm(viewModel);

        viewModel.setIsLogin(true);
        viewModel.setMenuResId(viewModel.getIsLogin().get());

        tabLayout = actMainBinding.incMainContent.incAppbar.tblMain;
        tabLayout.addTab(tabLayout.newTab().setText("카테고리1"));
        tabLayout.addTab(tabLayout.newTab().setText("카테고리2"));
        tabLayout.addTab(tabLayout.newTab().setText("카테고리3"));
        tabLayout.addTab(tabLayout.newTab().setText("카테고리4"));
        tabLayout.addTab(tabLayout.newTab().setText("카테고리5"));

        //setNvMenu();
    }

    public void setNvMenu(){
        actMainBinding.nvMain.getMenu().clear();
        actMainBinding.nvMain.inflateMenu(viewModel.getMenuResId().get());
    }


}
