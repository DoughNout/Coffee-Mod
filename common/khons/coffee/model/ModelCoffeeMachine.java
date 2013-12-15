package khons.coffee.model;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;

public class ModelCoffeeMachine extends ModelBase
{
  //fields
    ModelRenderer Back;
    ModelRenderer Drainage;
    ModelRenderer DrainageWallLeft;
    ModelRenderer DrainageWallFront;
    ModelRenderer DrainageWallRight;
    ModelRenderer Top;
    ModelRenderer Spout;
  
  public ModelCoffeeMachine()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Back = new ModelRenderer(this, 0, 0);
      Back.addBox(0F, 0F, 0F, 16, 16, 6);
      Back.setRotationPoint(-8F, 8F, 1F);
      Back.setTextureSize(64, 64);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
      Drainage = new ModelRenderer(this, 0, 22);
      Drainage.addBox(0F, 0F, 0F, 16, 3, 8);
      Drainage.setRotationPoint(-8F, 21F, -7F);
      Drainage.setTextureSize(64, 64);
      Drainage.mirror = true;
      setRotation(Drainage, 0F, 0F, 0F);
      DrainageWallLeft = new ModelRenderer(this, 44, -8);
      DrainageWallLeft.addBox(0F, 0F, 0F, 0, 3, 8);
      DrainageWallLeft.setRotationPoint(-8F, 18F, -7F);
      DrainageWallLeft.setTextureSize(64, 64);
      DrainageWallLeft.mirror = true;
      setRotation(DrainageWallLeft, 0F, 0F, 0F);
      DrainageWallFront = new ModelRenderer(this, 0, 33);
      DrainageWallFront.addBox(0F, 0F, 0F, 16, 3, 0);
      DrainageWallFront.setRotationPoint(-8F, 18F, -7F);
      DrainageWallFront.setTextureSize(64, 64);
      DrainageWallFront.mirror = true;
      setRotation(DrainageWallFront, 0F, 0F, 0F);
      DrainageWallRight = new ModelRenderer(this, 44, -5);
      DrainageWallRight.addBox(0F, 0F, 0F, 0, 3, 8);
      DrainageWallRight.setRotationPoint(8F, 18F, -7F);
      DrainageWallRight.setTextureSize(64, 64);
      DrainageWallRight.mirror = true;
      setRotation(DrainageWallRight, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 36);
      Top.addBox(0F, 0F, 0F, 16, 4, 6);
      Top.setRotationPoint(-8F, 8F, -5F);
      Top.setTextureSize(64, 64);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Spout = new ModelRenderer(this, 44, 6);
      Spout.addBox(0F, 0F, 0F, 1, 4, 1);
      Spout.setRotationPoint(0F, 12F, -2F);
      Spout.setTextureSize(64, 64);
      Spout.mirror = true;
      setRotation(Spout, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Back.render(f5);
    Drainage.render(f5);
    DrainageWallLeft.render(f5);
    DrainageWallFront.render(f5);
    DrainageWallRight.render(f5);
    Top.render(f5);
    Spout.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

