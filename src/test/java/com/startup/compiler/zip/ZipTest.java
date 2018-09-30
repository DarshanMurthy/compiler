package com.startup.compiler.zip;

import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipOutputStream;

import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ZipTest {
    @Rule public  final  TemporaryFolder temporaryFolder
            = new TemporaryFolder();



}