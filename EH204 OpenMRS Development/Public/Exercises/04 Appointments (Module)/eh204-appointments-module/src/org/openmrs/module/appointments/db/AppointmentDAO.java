/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.appointments.db;

import java.util.List;

import org.openmrs.Patient;
import org.openmrs.module.appointments.Appointment;

/**
 *
 */
public interface AppointmentDAO {
	
	public List<Appointment> getAppointmentsForPatient(Patient patient);
	
	public Appointment getAppointment(int appointmentId);
	
	public List<Appointment> getAllAppointments();
	
	public void updateAppointment(Appointment appointment);
	
	public void addAppointment(Appointment appointment);

}
