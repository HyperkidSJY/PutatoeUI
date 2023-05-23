package com.hyper.putatoeui

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.Toast
import com.hyper.putatoeui.databinding.ActivityMainBinding
import com.hyper.putatoeui.databinding.AddMoneyDialogBoxBinding
import com.hyper.putatoeui.databinding.RedeemGiftDialogBoxBinding
import com.hyper.putatoeui.databinding.SendBankDialogBoxBinding
import com.hyper.putatoeui.databinding.TransferMoneyDialogBoxBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var addMoneyDialogBinding : AddMoneyDialogBoxBinding
    private lateinit var redeemGiftDialogBoxBinding: RedeemGiftDialogBoxBinding
    private lateinit var sendBankDialogBoxBinding: SendBankDialogBoxBinding
    private lateinit var transferMoneyDialogBoxBinding: TransferMoneyDialogBoxBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.ivAddMoney.setOnClickListener {

            addMoneyDialogBinding = AddMoneyDialogBoxBinding.inflate(layoutInflater)
            val dialog = Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(addMoneyDialogBinding.root)
            dialog.setCancelable(true)

            addMoneyDialogBinding.ivClose.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }

        binding.redeemGift.setOnClickListener {

            Toast.makeText(this@MainActivity, "Processing please wait", Toast.LENGTH_SHORT).show()

            redeemGiftDialogBoxBinding = RedeemGiftDialogBoxBinding.inflate(layoutInflater)
            val dialog = Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(redeemGiftDialogBoxBinding.root)
            dialog.setCancelable(true)

            redeemGiftDialogBoxBinding.cancelButton.setOnClickListener {
                dialog.dismiss()
            }
            redeemGiftDialogBoxBinding.submitButton.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }

        binding.ivSendMoney.setOnClickListener {

            sendBankDialogBoxBinding = SendBankDialogBoxBinding.inflate(layoutInflater)
            val dialog = Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(sendBankDialogBoxBinding.root)
            dialog.setCancelable(true)

            sendBankDialogBoxBinding.ivClose.setOnClickListener {
                dialog.dismiss()
            }
            sendBankDialogBoxBinding.addBankAccountBtn.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }

        binding.tvTransferMoney.setOnClickListener {
            transferMoneyDialogBoxBinding = TransferMoneyDialogBoxBinding.inflate(layoutInflater)
            val dialog = Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(transferMoneyDialogBoxBinding.root)
            dialog.setCancelable(true)

            transferMoneyDialogBoxBinding.ivClose.setOnClickListener {
                dialog.dismiss()
            }
            transferMoneyDialogBoxBinding.btnSubmit.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }

    }
}