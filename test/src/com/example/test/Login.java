package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//���ӽ����ļ�
		this.setContentView(R.layout.login);
	}
	
	public void show(View v)
	{
		//������ͼ����ҳ����ת
		Intent it=new Intent("com.zse.login");
		this.startActivity(it);
	}

}
