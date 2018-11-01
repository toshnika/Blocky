package mygame;

import com.jme3.material.Material;

import mygame.util.Vector3Int;

/**
 *
 * @author bogdanpandia
 */
public class BlockSettings {

	private Vector3Int worldSizeInChunks;
	private Vector3Int chunkSize;
	private Material material;
	private float blockSize = 1f;
	private float viewDistance = 200f;

	public BlockSettings() {
	}


	public BlockSettings(Vector3Int chunkSize, Material material) {
		this();
		this.chunkSize = chunkSize;
		this.material = material;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Vector3Int getChunkSize() {
		return chunkSize;
	}

	public void setChunkSize(Vector3Int chunkSize) {
		this.chunkSize = chunkSize;
	}

	public void setWorldSize(Vector3Int worldSize) {
		this.worldSizeInChunks = worldSize;
	}

	public Vector3Int getWorldSize() {
		return worldSizeInChunks;
	}

	public void setBlockSize(float blockSize) {
		this.blockSize = blockSize;
	}

	public float getBlockSize() {
		return blockSize;
	}

	public void setViewDistance(float viewDistance) {
		this.viewDistance = viewDistance;
	}

	public float getViewDistance() {
		return this.viewDistance;
	}

}
