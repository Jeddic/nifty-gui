package de.lessvoid.nifty.gdx.render;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.utils.BufferUtils;
import de.lessvoid.nifty.render.batch.spi.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class GdxGL implements GL {
  @Override
  public int GL_ALPHA() {
    return GL11.GL_ALPHA;
  }

  @Override
  public int GL_ALPHA_TEST() {
    return GL11.GL_ALPHA_TEST;
  }

  @Override
  public int GL_BLEND() {
    return GL11.GL_BLEND;
  }

  @Override
  public int GL_BLEND_DST() {
    return GL11.GL_BLEND_DST;
  }

  @Override
  public int GL_BLEND_SRC() {
    return GL11.GL_BLEND_SRC;
  }

  @Override
  public int GL_BYTE() {
    return GL11.GL_BYTE;
  }

  @Override
  public int GL_COLOR_ARRAY() {
    return GL11.GL_COLOR_ARRAY;
  }

  @Override
  public int GL_COLOR_BUFFER_BIT() {
    return GL11.GL_COLOR_BUFFER_BIT;
  }

  @Override
  public int GL_CULL_FACE() {
    return GL11.GL_CULL_FACE;
  }

  @Override
  public int GL_DEPTH_TEST() {
    return GL11.GL_DEPTH_TEST;
  }

  @Override
  public int GL_DST_COLOR() {
    return GL11.GL_DST_COLOR;
  }

  @Override
  public int GL_FALSE() {
    return GL11.GL_FALSE;
  }

  @Override
  public int GL_FLOAT() {
    return GL11.GL_FLOAT;
  }

  @Override
  public int GL_INVALID_ENUM() {
    return GL11.GL_INVALID_ENUM;
  }

  @Override
  public int GL_INVALID_OPERATION() {
    return GL11.GL_INVALID_OPERATION;
  }

  @Override
  public int GL_INVALID_VALUE() {
    return GL11.GL_INVALID_VALUE;
  }

  @Override
  public int GL_LIGHTING() {
    return GL11.GL_LIGHTING;
  }

  @Override
  public int GL_LINEAR() {
    return GL11.GL_LINEAR;
  }

  @Override
  public int GL_LINEAR_MIPMAP_LINEAR() {
    return GL11.GL_LINEAR_MIPMAP_LINEAR;
  }

  @Override
  public int GL_LINEAR_MIPMAP_NEAREST() {
    return GL11.GL_LINEAR_MIPMAP_NEAREST;
  }

  @Override
  public int GL_LUMINANCE() {
    return GL11.GL_LUMINANCE;
  }

  @Override
  public int GL_LUMINANCE_ALPHA() {
    return GL11.GL_LUMINANCE_ALPHA;
  }

  @Override
  public int GL_MAX_TEXTURE_SIZE() {
    return GL11.GL_MAX_TEXTURE_SIZE;
  }

  @Override
  public int GL_MODELVIEW() {
    return GL11.GL_MODELVIEW;
  }

  @Override
  public int GL_NEAREST() {
    return GL11.GL_NEAREST;
  }

  @Override
  public int GL_NEAREST_MIPMAP_LINEAR() {
    return GL11.GL_NEAREST_MIPMAP_LINEAR;
  }

  @Override
  public int GL_NEAREST_MIPMAP_NEAREST() {
    return GL11.GL_NEAREST_MIPMAP_NEAREST;
  }

  @Override
  public int GL_NO_ERROR() {
    return GL11.GL_NO_ERROR;
  }

  @Override
  public int GL_NOTEQUAL() {
    return GL11.GL_NOTEQUAL;
  }

  @Override
  public int GL_ONE_MINUS_SRC_ALPHA() {
    return GL11.GL_ONE_MINUS_SRC_ALPHA;
  }

  @Override
  public int GL_OUT_OF_MEMORY() {
    return GL11.GL_OUT_OF_MEMORY;
  }

  @Override
  public int GL_POINTS() {
    return GL11.GL_POINTS;
  }

  @Override
  public int GL_PROJECTION() {
    return GL11.GL_PROJECTION;
  }

  @Override
  public int GL_RGB() {
    return GL11.GL_RGB;
  }

  @Override
  public int GL_RGBA() {
    return GL11.GL_RGBA;
  }

  @Override
  public int GL_SHORT() {
    return GL11.GL_SHORT;
  }

  @Override
  public int GL_SRC_ALPHA() {
    return GL11.GL_SRC_ALPHA;
  }

  @Override
  public int GL_STACK_OVERFLOW() {
    return GL11.GL_STACK_OVERFLOW;
  }

  @Override
  public int GL_STACK_UNDERFLOW() {
    return GL11.GL_STACK_UNDERFLOW;
  }

  @Override
  public int GL_TEXTURE_2D() {
    return GL11.GL_TEXTURE_2D;
  }

  @Override
  public int GL_TEXTURE_BINDING_2D() {
    return GL11.GL_TEXTURE_BINDING_2D;
  }

  @Override
  public int GL_TEXTURE_COORD_ARRAY() {
    return GL11.GL_TEXTURE_COORD_ARRAY;
  }

  @Override
  public int GL_TEXTURE_MAG_FILTER() {
    return GL11.GL_TEXTURE_MAG_FILTER;
  }

  @Override
  public int GL_TEXTURE_MIN_FILTER() {
    return GL11.GL_TEXTURE_MIN_FILTER;
  }

  @Override
  public int GL_TRIANGLES() {
    return GL11.GL_TRIANGLES;
  }

  @Override
  public int GL_TRIANGLE_STRIP() {
    return GL11.GL_TRIANGLE_STRIP;
  }

  @Override
  public int GL_TRIANGLE_FAN() {
    return GL11.GL_TRIANGLE_FAN;
  }

  @Override
  public int GL_TRUE() {
    return GL11.GL_TRUE;
  }

  @Override
  public int GL_UNSIGNED_BYTE() {
    return GL11.GL_UNSIGNED_BYTE;
  }

  @Override
  public int GL_UNSIGNED_SHORT() {
    return GL11.GL_UNSIGNED_SHORT;
  }

  @Override
  public int GL_UNSIGNED_SHORT_4_4_4_4() {
    return GL12.GL_UNSIGNED_SHORT_4_4_4_4;
  }

  @Override
  public int GL_UNSIGNED_SHORT_5_5_5_1() {
    return GL12.GL_UNSIGNED_SHORT_5_5_5_1;
  }

  @Override
  public int GL_UNSIGNED_SHORT_5_6_5() {
    return GL12.GL_UNSIGNED_SHORT_5_6_5;
  }

  @Override
  public int GL_VERTEX_ARRAY() {
    return GL11.GL_VERTEX_ARRAY;
  }

  @Override
  public int GL_VIEWPORT() {
    return GL11.GL_VIEWPORT;
  }

  @Override
  public int GL_ZERO() {
    return GL11.GL_ZERO;
  }

  @Override
  public void glAlphaFunc(int func, float ref) {
    GL11.glAlphaFunc(func, ref);
  }

  @Override
  public void glBindTexture(int target, int texture) {
    Gdx.gl.glBindTexture(target, texture);
  }

  @Override
  public void glBlendFunc(int sfactor, int dfactor) {
    Gdx.gl.glBlendFunc(sfactor, dfactor);
  }

  @Override
  public void glClear(int mask) {
    Gdx.gl.glClear(mask);
  }

  @Override
  public void glClearColor(float red, float green, float blue, float alpha) {
    Gdx.gl.glClearColor(red, green, blue, alpha);
  }

  @Override
  public void glColorPointer(int size, int type, int stride, FloatBuffer pointer) {
    GL11.glColorPointer(size, stride, pointer);
  }

  @Override
  public void glDeleteTextures(int n, IntBuffer textures) {
    Gdx.gl.glDeleteTextures(n, textures);
  }

  @Override
  public void glDisable(int cap) {
    Gdx.gl.glDisable(cap);
  }

  @Override
  public void glDisableClientState(int array) {
    GL11.glDisableClientState(array);
  }

  @Override
  public void glDrawArrays(int mode, int first, int count) {
    Gdx.gl.glDrawArrays(mode, first, count);
  }

  @Override
  public void glDrawElements(int mode, int count, int type, int indices) {
    Gdx.gl.glDrawElements(mode, count, type, indices);
  }

  @Override
  public void glEnable(int cap) {
    Gdx.gl.glEnable(cap);
  }

  @Override
  public void glEnableClientState(int array) {
      GL11.glEnableClientState(array);
  }

  @Override
  public void glGenTextures(int n, IntBuffer textures) {
    Gdx.gl.glGenTextures(n, textures);
  }

  @Override
  public int glGetError() {
    return Gdx.gl.glGetError();
  }

  @Override
  public void glGetIntegerv(int pname, int[] params, int offset) {
    IntBuffer intBuffer = BufferUtils.newIntBuffer(17);
    intBuffer.put(params,offset,params.length);
    Gdx.gl.glGetIntegerv(pname, intBuffer);
    intBuffer.get(params);
  }

  @Override
  public void glGetIntegerv(int pname, IntBuffer params) {
    Gdx.gl.glGetIntegerv(pname, params);
  }

  @Override
  public boolean glIsEnabled(int cap) {
    return Gdx.gl.glIsEnabled(cap);
  }

  @Override
  public void glLoadIdentity() {
      GL11.glLoadIdentity();
  }

  @Override
  public void glMatrixMode(int mode) {
      GL11.glMatrixMode(mode);
  }

  @Override
  public void glOrthof(float left, float right, float bottom, float top, float zNear, float zFar) {
      GL11.glOrtho(left, right, bottom, top, zNear, zFar);
  }

  @Override
  public void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer) {
      GL11.glTexCoordPointer(size, stride, pointer);
  }

  @Override
  public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
    Gdx.gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
  }

  @Override
  public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
    Gdx.gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
  }

  @Override
  public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
    Gdx.gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
  }

  @Override
  public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
    Gdx.gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
  }

  @Override
  public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
    Gdx.gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
  }

  @Override
  public void glTexParameterf(int target, int pname, float param) {
    Gdx.gl.glTexParameterf(target, pname, param);
  }

  @Override
  public void glTexParameteri(int target, int pname, int param) {
    Gdx.gl.glTexParameteri(target, pname, param);
  }

  @Override
  public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
    Gdx.gl.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
  }

  @Override
  public void glTranslatef(float x, float y, float z) {
      GL11.glTranslatef(x, y, z);
  }

  @Override
  public void glVertexPointer(int size, int type, int stride, FloatBuffer pointer) {
      GL11.glVertexPointer(size, stride, pointer);
  }

  @Override
  public void glViewport(int x, int y, int width, int height) {
    Gdx.gl.glViewport(x, y, width, height);
  }
}
