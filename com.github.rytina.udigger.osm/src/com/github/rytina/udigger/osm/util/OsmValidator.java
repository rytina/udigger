/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.rytina.udigger.osm.util;

import com.github.rytina.udigger.osm.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.github.rytina.udigger.osm.OsmPackage
 * @generated
 */
public class OsmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OsmValidator INSTANCE = new OsmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.github.rytina.udigger.osm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OsmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OsmPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OsmPackage.OSM_BOUND:
				return validateOsmBound((OsmBound)value, diagnostics, context);
			case OsmPackage.OSM_MEMBER:
				return validateOsmMember((OsmMember)value, diagnostics, context);
			case OsmPackage.OSM_ND:
				return validateOsmNd((OsmNd)value, diagnostics, context);
			case OsmPackage.OSM_NODE:
				return validateOsmNode((OsmNode)value, diagnostics, context);
			case OsmPackage.OSM_RELATION:
				return validateOsmRelation((OsmRelation)value, diagnostics, context);
			case OsmPackage.OSM_ROOT:
				return validateOsmRoot((OsmRoot)value, diagnostics, context);
			case OsmPackage.OSM_TAG:
				return validateOsmTag((OsmTag)value, diagnostics, context);
			case OsmPackage.OSM_WAY:
				return validateOsmWay((OsmWay)value, diagnostics, context);
			case OsmPackage.OSM_MEMBERTYPE:
				return validateOsmMembertype((OsmMembertype)value, diagnostics, context);
			case OsmPackage.OSM_MEMBERTYPE_OBJECT:
				return validateOsmMembertypeObject((OsmMembertype)value, diagnostics, context);
			case OsmPackage.OSM_ROLE:
				return validateOsmRole((String)value, diagnostics, context);
			case OsmPackage.OSM_TAGKEY:
				return validateOsmTagkey((String)value, diagnostics, context);
			case OsmPackage.OSM_TAGVALUE:
				return validateOsmTagvalue((String)value, diagnostics, context);
			case OsmPackage.OSM_USER:
				return validateOsmUser((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmBound(OsmBound osmBound, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmBound, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmMember(OsmMember osmMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmNd(OsmNd osmNd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmNd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmNode(OsmNode osmNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmRelation(OsmRelation osmRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmRoot(OsmRoot osmRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmTag(OsmTag osmTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmTag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmWay(OsmWay osmWay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmWay, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmMembertype(OsmMembertype osmMembertype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmMembertypeObject(OsmMembertype osmMembertypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmRole(String osmRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOsmRole_MinLength(osmRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateOsmRole_MaxLength(osmRole, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmRole_MinLength(String osmRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmRole.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OsmPackage.Literals.OSM_ROLE, osmRole, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmRole_MaxLength(String osmRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmRole.length();
		boolean result = length <= 250;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OsmPackage.Literals.OSM_ROLE, osmRole, length, 250, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmTagkey(String osmTagkey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOsmTagkey_MinLength(osmTagkey, diagnostics, context);
		if (result || diagnostics != null) result &= validateOsmTagkey_MaxLength(osmTagkey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Tagkey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmTagkey_MinLength(String osmTagkey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmTagkey.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OsmPackage.Literals.OSM_TAGKEY, osmTagkey, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Tagkey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmTagkey_MaxLength(String osmTagkey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmTagkey.length();
		boolean result = length <= 250;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OsmPackage.Literals.OSM_TAGKEY, osmTagkey, length, 250, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmTagvalue(String osmTagvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOsmTagvalue_MinLength(osmTagvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateOsmTagvalue_MaxLength(osmTagvalue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Tagvalue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmTagvalue_MinLength(String osmTagvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmTagvalue.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OsmPackage.Literals.OSM_TAGVALUE, osmTagvalue, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Tagvalue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmTagvalue_MaxLength(String osmTagvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmTagvalue.length();
		boolean result = length <= 3000;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OsmPackage.Literals.OSM_TAGVALUE, osmTagvalue, length, 3000, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmUser(String osmUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOsmUser_MinLength(osmUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateOsmUser_MaxLength(osmUser, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmUser_MinLength(String osmUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmUser.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OsmPackage.Literals.OSM_USER, osmUser, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsmUser_MaxLength(String osmUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = osmUser.length();
		boolean result = length <= 100;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OsmPackage.Literals.OSM_USER, osmUser, length, 100, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OsmValidator
