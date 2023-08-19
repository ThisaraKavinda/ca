package com.example.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1Str = binding.number1.getText().toString();
                String number2Str = binding.number2.getText().toString();

                if (number1Str.isEmpty() || number2Str.isEmpty()) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(requireContext());
                    alertDialogBuilder.setMessage("Please enter both numbers");
                    alertDialogBuilder.setPositiveButton("OK", null);
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                } else {
                    float number1Float = Float.parseFloat(number1Str);
                    float number2Float = Float.parseFloat(number2Str);

                    float answer = number1Float + number2Float;
                    Bundle bundle = new Bundle();
                    bundle.putFloat("answer", answer);

                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
                }
            }
        });

        binding.substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1Str = binding.number1.getText().toString();
                String number2Str = binding.number2.getText().toString();

                if (number1Str.isEmpty() || number2Str.isEmpty()) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(requireContext());
                    alertDialogBuilder.setMessage("Please enter both numbers");
                    alertDialogBuilder.setPositiveButton("OK", null);
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                } else {
                    float number1Float = Float.parseFloat(number1Str);
                    float number2Float = Float.parseFloat(number2Str);

                    float answer = number1Float - number2Float;
                    Bundle bundle = new Bundle();
                    bundle.putFloat("answer", answer);

                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
                }
            }
        });

        binding.multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1Str = binding.number1.getText().toString();
                String number2Str = binding.number2.getText().toString();

                if (number1Str.isEmpty() || number2Str.isEmpty()) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(requireContext());
                    alertDialogBuilder.setMessage("Please enter both numbers");
                    alertDialogBuilder.setPositiveButton("OK", null);
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                } else {
                    float number1Float = Float.parseFloat(number1Str);
                    float number2Float = Float.parseFloat(number2Str);

                    float answer = number1Float * number2Float;
                    Bundle bundle = new Bundle();
                    bundle.putFloat("answer", answer);

                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
                }
            }
        });

        binding.division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1Str = binding.number1.getText().toString();
                String number2Str = binding.number2.getText().toString();

                if (number1Str.isEmpty() || number2Str.isEmpty()) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(requireContext());
                    alertDialogBuilder.setMessage("Please enter both numbers");
                    alertDialogBuilder.setPositiveButton("OK", null);
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                } else {
                    float number1Float = Float.parseFloat(number1Str);
                    float number2Float = Float.parseFloat(number2Str);

                    float answer = number1Float / number2Float;
                    Bundle bundle = new Bundle();
                    bundle.putFloat("answer", answer);

                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}