package com.example.dell.task_6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_content, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_1:
                Toast.makeText(this, "已剪切",
            Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_2:
                Toast.makeText(this, "已成功复制到粘贴板",
            Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_3:
                Toast.makeText(this, "已粘贴",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_1:
                Toast.makeText(this, "欢迎加入多人聊天！",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_2:
                Toast.makeText(this, "请查找好友",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_3:
                Toast.makeText(this, "扫一扫二维码",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_4:
                Toast.makeText(this, "搜索中。。。",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_5:
                Toast.makeText(this, "请选择付款方式",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_popup);
        popup.show();
    }
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.job1:
                Toast.makeText(this, "打开文件", Toast.LENGTH_SHORT).show();
                break;
            case R.id.job2:
                Toast.makeText(this, "保存文件", Toast.LENGTH_SHORT).show();
                break;
            case R.id.job3:
                Toast.makeText(this, "打印文件", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }






}
