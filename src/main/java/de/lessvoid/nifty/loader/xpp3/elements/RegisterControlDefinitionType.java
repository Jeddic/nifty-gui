package de.lessvoid.nifty.loader.xpp3.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.Controller;
import de.lessvoid.nifty.input.NiftyInputMapping;
import de.lessvoid.nifty.input.mapping.NoInputMapping;
import de.lessvoid.nifty.loader.xpp3.ClassHelper;

/**
 * RegisterControlDefinitionType.
 * @author void
 */
public class RegisterControlDefinitionType {
  /**
   * log.
   */
  private static Logger log = Logger.getLogger(RegisterControlDefinitionType.class.getName());

  /**
   * name.
   */
  private String name;

  /**
   * controller.
   */
  private String controller;

  /**
   * inputMapper.
   */
  private String inputMapper;

  /**
   * elements.
   */
  private Collection < ElementType > elements = new ArrayList < ElementType >();

  /**
   * Create new instance.
   * @param nameParam name
   * @param controllerParam controller
   * @param inputMapperParam inputMapperParam
   */
  public RegisterControlDefinitionType(
      final String nameParam,
      final String controllerParam,
      final String inputMapperParam) {
    this.name = nameParam;
    this.controller = controllerParam;
    this.inputMapper = inputMapperParam;
  }

  /**
   * Add a element.
   * @param elementType element to add
   */
  public void addElement(final ElementType elementType) {
    this.elements.add(elementType);
  }

  /**
   * Get new controller instance for this control definition.
   * @param nifty nifty
   * @return Controller
   */
  public Controller getControllerInstance(final Nifty nifty) {
    return ClassHelper.getInstance(controller, Controller.class);
  }

  /**
   * Get new NiftyInputMapping instance.
   * @return NiftyInputMapping
   */
  public NiftyInputMapping getInputMappingInstance() {
    NiftyInputMapping inputMapping = ClassHelper.getInstance(inputMapper, NiftyInputMapping.class);
    if (inputMapping == null) {
      log.warning("unable to instance inputMapping - fall back to no mapping");
      inputMapping = new NoInputMapping();
    }
    return inputMapping;
  }

  /**
   * get elements.
   * @return element collection
   */
  public Collection < ElementType > getElements() {
    return elements;
  }
}