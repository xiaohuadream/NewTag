package com.example.newtag2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xyz.informercial.base.BusiAd
import com.xyz.informercial.ktx.toast
import com.xyz.informercial.listener.OnBackListener
import com.xyz.informercial.view.ad.OpenScreenView
import com.xyz.mylibrary.TestUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestUtils.showToast2(this)

        val infoView = findViewById<OpenScreenView>(R.id.infoView)
        BusiAd.openScreenAd(
            infoView,
            "1759865692357197826",
            "1759865845931638785",
            R.mipmap.ic_launcher,
            true,
            back = object : OnBackListener {

                override fun onLoadSuccess() {
                    "广告拉取成功".toast()
                }

                override fun onLoadError() {
                    "广告拉取失败".toast()
                    finish()
                }

                override fun onClickClose() {
                    "点击了跳过".toast()
                    finish()
                }

                override fun onClickContent() {
                    "点击了广告".toast()
                }

                override fun onTimeOver() {
                    "广告倒计时完成".toast()

                }
            })
    }
}
