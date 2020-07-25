package com.github.jhamin0511.datamapping.widget.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.github.jhamin0511.datamapping.R
import com.github.jhamin0511.datamapping.databinding.EditDialogBinding
import com.github.jhamin0511.datamapping.key.ITEM
import com.github.jhamin0511.datamapping.key.LOGIC
import com.github.jhamin0511.datamapping.ui.order.detail.OrderLogic


class EditDialog : DialogFragment() {

    companion object {
        fun getInstance(logic: OrderLogic, item: String): DialogFragment {
            val bundle = Bundle().apply {
                putSerializable(LOGIC, logic)
                putString(ITEM, item)
            }

            return EditDialog().apply {
                arguments = bundle
            }
        }
    }

    private lateinit var binding: EditDialogBinding
    private lateinit var logic: OrderLogic

    override fun onAttach(context: Context) {
        super.onAttach(context)

        logic = arguments?.getSerializable(LOGIC)!! as OrderLogic
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val title = arguments?.getString(ITEM)

        val context = requireActivity()
        val builder = AlertDialog.Builder(context)
        val inflater = context.layoutInflater
        binding = DataBindingUtil.inflate(inflater, R.layout.edit_dialog, null, false)
        binding.edit.setText(title)

        builder.setView(binding.root)
            .setTitle(title)
            .setPositiveButton(android.R.string.ok) { dialog, id ->
                val value = binding.edit.text.toString()
                logic.onChangedName(value)
            }
        builder.create()

        return builder.create()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = DataBindingUtil.bind(view)!!

        binding.edit.setText(arguments?.getString(ITEM))
    }

}
