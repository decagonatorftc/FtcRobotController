package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;

@TeleOp
public class MecanumFieldRelative extends OpMode {
   private MecanumDrive mecanumDrive;
   double forward;
   double strafe;
   double rotate;


    @Override
    public void init() {
        mecanumDrive = new MecanumDrive();
        mecanumDrive.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

        mecanumDrive.driveFieldRelative(forward, strafe, rotate);
    }
}
