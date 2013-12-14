package khons.coffee.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CoffeeMachineModel extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Side;
    ModelRenderer Top;
    ModelRenderer Shape2;
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape21;
    ModelRenderer Shape11;
    ModelRenderer Shape211;
    ModelRenderer Shape2111;
    ModelRenderer Shape21111;
    ModelRenderer Shape5;
  
  public CoffeeMachineModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 16, 1, 16);
      Base.setRotationPoint(-8F, 23F, -8F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Side = new ModelRenderer(this, 0, 0);
      Side.addBox(0F, 0F, 0F, 1, 15, 12);
      Side.setRotationPoint(-8F, 8F, -6F);
      Side.setTextureSize(64, 32);
      Side.mirror = true;
      setRotation(Side, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(0F, 0F, 0F, 11, 1, 12);
      Top.setRotationPoint(-7F, 8F, -6F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 54, 25);
      Shape2.addBox(0F, 0F, 0.4F, 4, 6, 1);
      Shape2.setRotationPoint(1F, 17F, 4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0.7853982F, 0F);
      Shape1 = new ModelRenderer(this, 54, 25);
      Shape1.addBox(0F, 0F, 0F, 4, 6, 1);
      Shape1.setRotationPoint(-2F, 17F, 4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 54, 22);
      Shape3.addBox(-0.2F, 0F, 0.2F, 1, 6, 4);
      Shape3.setRotationPoint(4F, 17F, -2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 54, 22);
      Shape4.addBox(0.2F, 0F, 0F, 1, 6, 4);
      Shape4.setRotationPoint(-5F, 17F, -2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape21 = new ModelRenderer(this, 54, 25);
      Shape21.addBox(0.2F, 0F, 0.2F, 4, 6, 1);
      Shape21.setRotationPoint(2F, 17F, -5F);
      Shape21.setTextureSize(64, 32);
      Shape21.mirror = true;
      setRotation(Shape2, 0F, -0.7853982F, 0F);
      Shape11 = new ModelRenderer(this, 54, 25);
      Shape11.addBox(0F, 0F, 0.2F, 4, 6, 1);
      Shape11.setRotationPoint(-2F, 17F, -5F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape211 = new ModelRenderer(this, 54, 25);
      Shape211.addBox(0.2F, 0F, 0.2F, 4, 6, 1);
      Shape211.setRotationPoint(-5F, 17F, -2F);
      Shape211.setTextureSize(64, 32);
      Shape211.mirror = true;
      setRotation(Shape2, 0F, 0.7853982F, 0F);
      Shape2111 = new ModelRenderer(this, 54, 25);
      Shape2111.addBox(0F, 0F, 0.2F, 4, 6, 1);
      Shape2111.setRotationPoint(-4F, 17F, 1F);
      Shape2111.setTextureSize(64, 32);
      Shape2111.mirror = true;
      setRotation(Shape2, 0F, -0.7853982F, 0F);
      Shape21111 = new ModelRenderer(this, 54, 25);
      Shape21111.addBox(0F, 0F, 0.4F, 4, 6, 1);
      Shape21111.setRotationPoint(1F, 17F, 4F);
      Shape21111.setTextureSize(64, 32);
      Shape21111.mirror = true;
      setRotation(Shape2, 0F, 0.7853982F, 0F);
      Shape5 = new ModelRenderer(this, 60, 19);
      Shape5.addBox(0F, 0F, 0F, 1, 12, 1);
      Shape5.setRotationPoint(-1F, 9F, -1F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Side.render(f5);
    Top.render(f5);
    Shape2.render(f5);
    Shape1.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape21.render(f5);
    Shape11.render(f5);
    Shape211.render(f5);
    Shape2111.render(f5);
    Shape21111.render(f5);
    Shape5.render(f5);
  }
  
  public void renderModel(float f)
  {
	  Base.render(f);
	  Side.render(f);
	  Top.render(f);
	  Shape2.render(f);
	  Shape1.render(f);
	  Shape3.render(f);
	  Shape4.render(f);
	  Shape21.render(f);
	  Shape11.render(f);
	  Shape211.render(f);
	  Shape2111.render(f);
	  Shape21111.render(f);
	  Shape5.render(f);
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
